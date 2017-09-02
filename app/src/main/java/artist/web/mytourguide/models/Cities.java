package artist.web.mytourguide.models;

/**
 * Created by User on 8/3/2017.
 */

public class Cities {

    private String mCountryName;
    private String mCityDescription;
    private String mCityAttractions;
    private String mCitySpecialities;
    private String mCityLanguage;

    public Cities(String mCountryName, String mCityDescription,
                  String mCityAttractions, String mCitySpecialities, String mCityLanguage) {
        this.mCountryName = mCountryName;
        this.mCityDescription = mCityDescription;
        this.mCityAttractions = mCityAttractions;
        this.mCitySpecialities = mCitySpecialities;
        this.mCityLanguage = mCityLanguage;
    }

    public String getCountryName() {
        return mCountryName;
    }

    public String getCityDescription() {
        return mCityDescription;
    }

    public String getCityAttractions() {
        return mCityAttractions;
    }

    public String getCitySpecialities() {
        return mCitySpecialities;
    }

    public String getCityLanguage() {
        return mCityLanguage;
    }
}
