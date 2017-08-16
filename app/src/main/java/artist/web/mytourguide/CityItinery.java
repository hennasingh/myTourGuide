package artist.web.mytourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CityItinery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_itinery);

        Bundle extras = getIntent().getExtras();

        if(extras!=null){
            int image_id = extras.getInt("country");

            switch(image_id){
                case R.id.image_india:
                    break;
                case R.id.image_prague:
                    break;
                case R.id.image_switzerland:
                    break;

            }


                    }
    }
}
