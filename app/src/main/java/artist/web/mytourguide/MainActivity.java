package artist.web.mytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView image_prague;
    ImageView image_india;
    ImageView image_switzerland;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image_prague = (ImageView) findViewById(R.id.image_prague);
        image_india = (ImageView) findViewById(R.id.image_india);
        image_switzerland = (ImageView) findViewById(R.id.image_switzerland);

        image_prague.setOnClickListener(this);
        image_india.setOnClickListener(this);
        image_switzerland.setOnClickListener(this);


        public void onClick (View view){

        Intent i = new Intent(getApplicationContext(), CountryItinery.class);

            switch (view.getId()) {
                case R.id.image_india:
                    i.putExtra("india", R.drawable.india);
                    startActivity(i);
                    break;
                case R.id.image_prague:
                    i.putExtra("prague", R.drawable.switzerland);
                    startActivity(i);
                    break;
                case R.id.image_switzerland:
                    i.putExtra("switzerland", R.drawable.switzerland);
                    startActivity(i);
                    break;
            }


        }
    }

}
