package artist.web.mytourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import artist.web.mytourguide.R;
import artist.web.mytourguide.models.Cities;

import static artist.web.mytourguide.MainActivity.cityDublin;
import static artist.web.mytourguide.MainActivity.cityGoa;
import static artist.web.mytourguide.MainActivity.cityKerala;
import static artist.web.mytourguide.MainActivity.cityParis;
import static artist.web.mytourguide.MainActivity.cityPrague;
import static artist.web.mytourguide.MainActivity.cityZurich;


public class CityFragment extends Fragment {

    private static final String LOG_TAG = "CityFragment";
    private String mSelectedCity;
    private View view;

    //variables for City
    private String mCountry;
    private String mLanguage;
    private int mCityIcon;
    private String mAboutCity;
    private String mAttractions;
    private String mSpecialities;


    ImageView placeIcon;
    TextView countryName;
    TextView languageName;
    TextView attractionInfo;
    TextView specialInfo;
    TextView aboutCity;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Get Intent Extras
        if (getActivity().getIntent().getExtras() != null) {
            Bundle bundle = getActivity().getIntent().getExtras();
            mSelectedCity = bundle.getString("city");
            Log.v("CityFragment",mSelectedCity);
        }

        // Inflate view object
        view = inflater.inflate(R.layout.fragment_city, container, false);

        //initialize UI objects
        placeIcon = (ImageView)view.findViewById(R.id.place_icon);
        countryName = (TextView)view.findViewById(R.id.country);
        languageName = (TextView)view.findViewById(R.id.language);
        attractionInfo = (TextView)view.findViewById(R.id.attractions);
        specialInfo = (TextView)view.findViewById(R.id.specials);
        aboutCity = (TextView)view.findViewById(R.id.about_text);


        extractCityDetails(mSelectedCity);


        return view;
    }

    private void extractCityDetails(String selectedCity){
        switch (selectedCity){
            case "Kerala":
                for (Cities Kerala :cityKerala) {
                    mCountry = Kerala.getCountryName();
                    mAboutCity = Kerala.getCityDescription();
                    mAttractions = Kerala.getCityAttractions();
                    mSpecialities = Kerala.getCitySpecialities();
                    mLanguage = Kerala.getCityLanguage();
                    mCityIcon = R.drawable.kerala1;
                }
                    break;
            case "Goa":
                for (Cities Goa :cityGoa){
                    mCountry = Goa.getCountryName();
                    mAboutCity = Goa.getCityDescription();
                    mAttractions = Goa.getCityAttractions();
                    mSpecialities = Goa.getCitySpecialities();
                    mLanguage = Goa.getCityLanguage();
                    mCityIcon =R.drawable.goa;
                }
                break;
            case "Dublin":
                for (Cities Dublin :cityDublin){
                    mCountry = Dublin.getCountryName();
                    mAboutCity = Dublin.getCityDescription();
                    mAttractions = Dublin.getCityAttractions();
                    mSpecialities = Dublin.getCitySpecialities();
                    mLanguage = Dublin.getCityLanguage();
                    mCityIcon = R.drawable.dublin;
                }
                break;
            case "Paris":
                for (Cities Paris :cityParis){
                    mCountry = Paris.getCountryName();
                    mAboutCity = Paris.getCityDescription();
                    mAttractions = Paris.getCityAttractions();
                    mSpecialities = Paris.getCitySpecialities();
                    mLanguage = Paris.getCityLanguage();
                    mCityIcon = R.drawable.paris;
                }
                break;
            case "Prague":
                for (Cities Prague :cityPrague){
                    mCountry = Prague.getCountryName();
                    mAboutCity = Prague.getCityDescription();
                    mAttractions = Prague.getCityAttractions();
                    mSpecialities = Prague.getCitySpecialities();
                    mLanguage = Prague.getCityLanguage();
                    mCityIcon = R.drawable.prague1;
                }
                break;
            case "Zurich":
                for (Cities Zurich :cityZurich){
                    mCountry = Zurich.getCountryName();
                    mAboutCity = Zurich.getCityDescription();
                    mAttractions = Zurich.getCityAttractions();
                    mSpecialities = Zurich.getCitySpecialities();
                    mLanguage = Zurich.getCityLanguage();
                    mCityIcon = R.drawable.zurich;
                }
                break;

        }
           countryName.setText(mCountry);
           aboutCity.setText(mAboutCity);
           specialInfo.setText(mSpecialities);
           attractionInfo.setText(mAttractions);
           languageName.setText(mLanguage);
           placeIcon.setImageResource(mCityIcon);

    }
}



