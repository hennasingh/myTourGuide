package artist.web.mytourguide;

/**
 * Created by User on 8/3/2017.
 */

public class Cities {

    private String placeName;
    private String placeDescription;
    private String placeImageId;
    private String placeAddress;
    private int placePrice;

    public Cities(String placeName, String placeDescription, String placeImageId, String placeAddress, int placePrice ) {
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.placeImageId = placeImageId;
        this.placeAddress = placeAddress;
        this.placePrice = placePrice;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public String getPlaceImageId() {
        return placeImageId;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public int getPlacePrice() {
        return placePrice;
    }
}
