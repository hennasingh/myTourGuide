package artist.web.mytourguide.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import artist.web.mytourguide.R;
import artist.web.mytourguide.models.Tours;

import static artist.web.mytourguide.R.id.tour_cost;
import static artist.web.mytourguide.R.id.tour_icon;

/**
 * Created by User on 8/14/2017.
 */

public class TourAdapter extends ArrayAdapter<Tours> {

    private static final String LOG_TAG = TourAdapter.class.getSimpleName();

    public TourAdapter(Context context, List<Tours> tours) {
        super(context, 0, tours);
    }


    static class ViewHolder {
        private ImageView tour_icon;
        private TextView tour_name;
        private TextView tour_time;
        private TextView tour_cost;
        private RatingBar tour_stars;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_tour, parent, false);
        }

        ViewHolder holder = new ViewHolder();
        Tours currentTour = getItem(position);

        holder.tour_icon = (ImageView) convertView.findViewById(tour_icon);
        holder.tour_name = (TextView) convertView.findViewById(R.id.tour_name);
        holder.tour_time = (TextView) convertView.findViewById(R.id.tour_time);
        holder.tour_cost = (TextView) convertView.findViewById(tour_cost);
        String cost = "Euro " +currentTour.getTourCost() + " per person";

        convertView.setTag(holder);

        holder.tour_stars = (RatingBar) convertView.findViewById(R.id.rating_stars);
        holder.tour_name.setText(currentTour.getTourName());
        holder.tour_time.setText(currentTour.getTourTime());
        holder.tour_cost.setText(cost);
        holder.tour_icon.setImageResource(currentTour.getTourIcon());
        holder.tour_stars.setRating(currentTour.getTourRating());

        return convertView;
    }
}
