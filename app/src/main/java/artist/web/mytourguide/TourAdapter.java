package artist.web.mytourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import java.util.List;

/**
 * Created by User on 8/14/2017.
 */

public class TourAdapter extends ArrayAdapter<Tours> {

    private static final String LOG_TAG = TourAdapter.class.getSimpleName();

    public TourAdapter(Context context, List<Tours> tours) {
        super(context, 0, tours);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_tour, parent, false);
        }

        Tours currentTour = getItem(position);

        ImageView tour_icon = (ImageView) convertView.findViewById(R.id.tour_icon);
        tour_icon.setImageResource(currentTour.getTourIcon());

        TextView tour_name = (TextView) convertView.findViewById(R.id.tour_name);
        tour_name.setText(currentTour.getTourName());

        TextView tour_time = (TextView) convertView.findViewById(R.id.tour_time);
        tour_time.setText(currentTour.getTourTime());

        TextView tour_cost = (TextView) convertView.findViewById(R.id.tour_cost);
        String cost = "Euro " +currentTour.getTourCost() + " per person";
        tour_cost.setText(cost);

        RatingBar tour_stars = (RatingBar) convertView.findViewById(R.id.rating_stars);
        tour_stars.setRating(currentTour.getTourRating());
        return convertView;
    }
}
