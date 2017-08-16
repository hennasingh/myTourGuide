package artist.web.mytourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 8/14/2017.
 */

public class TourAdapter extends ArrayAdapter<Tours> {

    private static final String LOG_TAG = TourAdapter.class.getSimpleName();

    public TourAdapter(Context context, ArrayList<Tours> tours) {
        super(context,0,tours);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_tour,parent,false);
        }

        Tours currentTour =getItem(position);

        ImageView tour_icon = (ImageView)convertView.findViewById(R.id.tour_icon);
        tour_icon.setImageResource(currentTour.getTour_icon());

        TextView tour_name = (TextView)convertView.findViewById(R.id.tour_name);
        tour_name.setText(currentTour.getTour_name());

        TextView tour_time = (TextView)convertView.findViewById(R.id.tour_time);
        tour_time.setText(currentTour.getTour_time());

        TextView tour_cost = (TextView)convertView.findViewById(R.id.tour_cost);
        int cost = currentTour.getTour_cost();
        tour_cost.setText("Euro "+ cost+ " per person");

        ImageView tour_stars = (ImageView)convertView.findViewById(R.id.tour_stars);
         int imageResource = calculateRatingIcon(currentTour.getTour_rating());
         tour_stars.setImageResource(imageResource);
        return convertView;
    }

    private int calculateRatingIcon(double stars){

        int resource = 0;

        switch(String.valueOf(stars)){
            case "0.5":
                resource =R.drawable.rating_five;
                break;
            case "1.0":
                resource = R.drawable.rating_five;
                break;
            case "1.5":
                resource = R.drawable.rating_five;
                break;
            case "2":
                resource = R.drawable.rating_five;
            case "2.5":
                resource = R.drawable.rating_five;
                break;
            case "3":
                resource=R.drawable.rating_five;
                break;
            case "3.5":
                resource = R.drawable.rating_five;
                break;
            case "4":
                resource = R.drawable.rating_five;
                break;
            case "4.5":
                resource = R.drawable.rating_five;
                break;
            case "5":
                resource = R.drawable.rating_five;
                break;
        }
        return resource;

    }
}
