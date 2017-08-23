package artist.web.mytourguide;

/**
 * Created by User on 8/14/2017.
 */

public class Tours {

    private int tourIcon;
    private String tourName;
    private String tourTime;
    private int tourCost;
    private float tourRating;
    private String tourDesc;

    public Tours(String tourName,int tourIcon, String tourTime,
                 int tourCost, float tourRating, String tourDesc) {
        this.tourIcon = tourIcon;
        this.tourName = tourName;
        this.tourTime = tourTime;
        this.tourCost = tourCost;
        this.tourRating = tourRating;
        this.tourDesc = tourDesc;
    }

    public int getTourIcon() {
        return tourIcon;
    }

    public String getTourName() {
        return tourName;
    }

    public String getTourTime() {
        return tourTime;
    }

    public int getTourCost() {
        return tourCost;
    }

    public float getTourRating() {
        return tourRating;
    }

    public String getTourDesc() {
        return tourDesc;
    }
}
