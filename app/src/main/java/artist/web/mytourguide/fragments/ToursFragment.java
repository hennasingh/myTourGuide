package artist.web.mytourguide.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import artist.web.mytourguide.R;
import artist.web.mytourguide.adapters.PlacesAdapter;

import static artist.web.mytourguide.MainActivity.dineGoa;
import static artist.web.mytourguide.MainActivity.dineParis;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToursFragment extends Fragment {

    private static final String LOG_TAG = "ToursFragment";
    private View view;
    private String mSelectedCity;
    private ListView mListView;
    private PlacesAdapter placesAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate view object
        view = inflater.inflate(R.layout.fragment_sights, container, false);

        // Get Intent Extras
        if (getActivity().getIntent().getExtras() != null) {
            Bundle bundle = getActivity().getIntent().getExtras();
            mSelectedCity = bundle.getString("city");
        }

        if((mSelectedCity.equals((getString(R.string.kerala))))||(mSelectedCity.equals((getString(R.string.goa))))
                ||(mSelectedCity.equals((getString(R.string.prague))))){

            placesAdapter = new PlacesAdapter(getActivity(),dineGoa);

        }else{
            placesAdapter = new PlacesAdapter(getActivity(),dineParis);
        }

        mListView = (ListView)view.findViewById(R.id.listview);
        mListView.setAdapter(placesAdapter);
        return view;
    }
    }

