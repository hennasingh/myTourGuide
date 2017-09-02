package artist.web.mytourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import artist.web.mytourguide.models.Tours;
import butterknife.BindView;
import butterknife.ButterKnife;

public class TourDetailsActivity extends AppCompatActivity {

    private Tours selectedTour;
    @BindView(R.id.tour_name) TextView tourName;
    @BindView(R.id.tour_icon) ImageView tourIcon;
    @BindView(R.id.tour_cost) TextView tourCost;
    @BindView(R.id.tv_desc) TextView tourDesc;
    @BindView(R.id.rating_stars) RatingBar tourStars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_details);

        //get Intent Extras
        /** Get Intent Extras */
        if (getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            int listPosition = bundle.getInt("position");

            // Get the tour that was clicked on in Book List
            selectedTour = MainActivity.tourList.get(listPosition);
        }

        ButterKnife.bind(this);

        //Display Information
        displayTourDetails();
    }

    private void displayTourDetails(){

        //Tour Image
        int image = selectedTour.getTourIcon();
        tourIcon.setImageResource(image);

        //Tour Name
        String name = selectedTour.getTourName();
        tourName.setText(name);

        //Tour Cost
        String cost = selectedTour.getTourCost()+ "";
        tourCost.setText(cost);

        //Rating Bar
        float stars = selectedTour.getTourRating();
        tourStars.setRating(stars);

        //Tour Description
        String desc = selectedTour.getTourDesc();
        tourDesc.setText(desc);
    }
}
