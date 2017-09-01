package artist.web.mytourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 9/1/2017.
 */

public class PlacesAdapter extends ArrayAdapter<Places> {

    public PlacesAdapter(Activity context, List<Places> places){
        super(context, 0 , places);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Places currentPlace = getItem(position);

        //View listItemView = convertView;
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_places,parent,false);

        ImageView placeIcon = (ImageView)convertView.findViewById(R.id.place_icon);
        placeIcon.setImageResource(currentPlace.getPlaceIcon());

        TextView placeName = (TextView)convertView.findViewById(R.id.place_name);
        placeName.setText(currentPlace.getPlaceName());

        TextView placeAddress =(TextView)convertView.findViewById(R.id.place_address);
        placeAddress.setText(currentPlace.getPlaceLocation());

        RatingBar rating = (RatingBar)convertView.findViewById(R.id.rating_stars);
        rating.setRating(currentPlace.getRating());

        return convertView;
    }
}
