package artist.web.mytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView image_kerala;
    ImageView image_goa;
    ImageView image_paris;
    ImageView image_zurich;
    ImageView image_dublin;
    ImageView image_prague;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image_kerala = (ImageView)findViewById(R.id.image_kerala);
        image_goa = (ImageView)findViewById(R.id.image_goa);
        image_paris = (ImageView)findViewById(R.id.image_paris);
        image_zurich =(ImageView)findViewById(R.id.image_zurich);
        image_dublin = (ImageView)findViewById(R.id.image_dublin);
        image_prague = (ImageView)findViewById(R.id.image_prague);

        ArrayList<Tours> tourTravels = new ArrayList<Tours>();

        tourTravels.add(new Tours("Dublin to Galway",R.drawable.dubtogal,"10 hours", 50,3.5));
        tourTravels.add(new Tours("Dublin to Belfast",R.drawable.dubtogal,"11 hours", 70,4));
        tourTravels.add(new Tours("Paris Charms & Secrets",R.drawable.dubtogal,"5 hours", 30,3.5));
        tourTravels.add(new Tours("Paris: Taste of Montmarte",R.drawable.dubtogal,"3 hours", 90,4));
        tourTravels.add(new Tours("Zurich Cruise Trip",R.drawable.dubtogal,"10 hours", 75,4));
        tourTravels.add(new Tours("Prague Riverside Party",R.drawable.dubtogal,"4 hours", 25,3.5));

        TourAdapter tourAdapter = new TourAdapter(this,tourTravels);
        ListView toursList = (ListView)findViewById(R.id.listview_tours);

        toursList.setAdapter(tourAdapter);

        toursList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

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
