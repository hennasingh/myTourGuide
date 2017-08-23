package artist.web.mytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.image_kerala) ImageView image_kerala;
    @BindView(R.id.image_goa) ImageView image_goa;
    @BindView(R.id.image_paris) ImageView image_paris;
    @BindView(R.id.image_zurich) ImageView image_zurich;
    @BindView(R.id.image_dublin) ImageView image_dublin;
    @BindView(R.id.image_prague) ImageView image_prague;

    public static List<Tours> tourList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        tourList = new ArrayList<Tours>();

        tourList.add(new Tours("Dublin to Galway",R.drawable.galway,"10 hours", 50,3.5, R.string.dubtogal));
        tourList.add(new Tours("Dublin to Belfast",R.drawable.belfast,"11 hours", 70,4, R.string.dubtobel));
        tourList.add(new Tours("Paris Charms & Secrets",R.drawable.parischarms,"5 hours", 30,3.5, R.string.parischarms));
        tourList.add(new Tours("Paris: Taste of Montmarte",R.drawable.parismontmartre,"3 hours", 90,5, R.string.parisfood));
        tourList.add(new Tours("Zurich Cruise Trip",R.drawable.zurich_cruise,"10 hours", 75,4, R.string.zurichcruise));
        tourList.add(new Tours("Prague Riverside Party",R.drawable.prague_riverside,"4 hours", 25,5, R.string.pragueriver));

        TourAdapter tourAdapter = new TourAdapter(this,tourList);
        ListView toursListView = (ListView)findViewById(R.id.listview_tours);

        toursListView.setAdapter(tourAdapter);

        toursListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),TourDetailsActivity.class);
                    intent.putExtra("position", position);
                    startActivity(intent);
            }
        });
     }

    public void onClick (View view){

        Intent i = new Intent(getApplicationContext(), CityItinery.class);

        switch (view.getId()) {
            case R.id.image_kerala:
                i.putExtra("city", R.id.image_kerala);
                startActivity(i);
                break;
            case R.id.image_goa:
                i.putExtra("city", R.id.image_goa);
                startActivity(i);
                break;
            case R.id.image_paris:
                i.putExtra("city", R.id.image_paris);
                startActivity(i);
                break;
            case R.id.image_prague:
                i.putExtra("city", R.id.image_prague);
                startActivity(i);
                break;
            case R.id.image_zurich:
                i.putExtra("city", R.id.image_zurich);
                startActivity(i);
                break;
            case R.id.image_dublin:
                i.putExtra("city", R.id.image_dublin);
                startActivity(i);
                break;
        }
    }





}
