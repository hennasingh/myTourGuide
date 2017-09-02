package artist.web.mytourguide.models;

/**
 * Created by User on 9/1/2017.
 */

public class Places {

    private String placeName;
    private String placeLocation;
    private int placeIcon;
    private float rating;

    public Places(String placeName, String placeLocation, int placeIcon, float rating) {
        this.placeName = placeName;
        this.placeLocation = placeLocation;
        this.placeIcon = placeIcon;
        this.rating = rating;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceLocation() {
        return placeLocation;
    }

    public int getPlaceIcon() {
        return placeIcon;
    }

    public float getRating(){
        return rating;
    }
}
