package artist.web.mytourguide.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import artist.web.mytourguide.R;
import artist.web.mytourguide.models.Places;

/**
 * Created by User on 9/1/2017.
 */

public class PlacesAdapter extends ArrayAdapter<Places> {

    public PlacesAdapter(Activity context, List<Places> places){
        super(context, 0 , places);
    }

    static class ViewHolder {
        private ImageView placeIcon;
        private TextView placeName;
        private TextView placeAddress;
        private RatingBar rating;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Places currentPlace = getItem(position);
        ViewHolder holder = new ViewHolder();

        //View listItemView = convertView;
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_places,parent,false);

        holder.placeIcon = (ImageView)convertView.findViewById(R.id.place_icon);
        holder.placeName = (TextView)convertView.findViewById(R.id.place_name);
        holder.placeAddress =(TextView)convertView.findViewById(R.id.place_address);
        holder.rating = (RatingBar)convertView.findViewById(R.id.rating_stars);
       convertView.setTag(holder);

        holder.placeIcon.setImageResource(currentPlace.getPlaceIcon());
        holder.placeName.setText(currentPlace.getPlaceName());
        holder.placeAddress.setText(currentPlace.getPlaceLocation());
        holder.rating.setRating(currentPlace.getRating());

        return convertView;
    }
}
