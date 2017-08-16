package artist.web.mytourguide;

/**
 * Created by User on 8/14/2017.
 */

public class Tours {

    private int tour_icon;
    private String tour_name;
    private String tour_time;
    private int tour_cost;
    private double tour_rating;

    public Tours(String tour_name,int tour_icon, String tour_time,
                 int tour_cost, double tour_rating) {
        this.tour_icon = tour_icon;
        this.tour_name = tour_name;
        this.tour_time = tour_time;
        this.tour_cost = tour_cost;
        this.tour_rating = tour_rating;
    }

    public int getTour_icon() {
        return tour_icon;
    }

    public String getTour_name() {
        return tour_name;
    }

    public String getTour_time() {
        return tour_time;
    }

    public int getTour_cost() {
        return tour_cost;
    }

    public double getTour_rating() {
        return tour_rating;
    }

 }
