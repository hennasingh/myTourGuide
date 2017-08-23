package artist.web.mytourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CountryItinery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_itinery);

        Bundle extras = getIntent().getExtras();

        if(extras!=null){

        }
    }
}
