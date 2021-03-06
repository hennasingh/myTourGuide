package artist.web.mytourguide.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import artist.web.mytourguide.fragments.CityFragment;
import artist.web.mytourguide.fragments.DiningFragment;
import artist.web.mytourguide.fragments.HotelFragment;
import artist.web.mytourguide.fragments.SightsFragment;
import artist.web.mytourguide.fragments.ToursFragment;

/**
 * Created by User on 8/25/2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

     private int pageCount =5;
     private Context context;
     private String tabTitles[]= {"City","Sights","Dining","Hotels","Tours"};

     public FragmentAdapter (FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch(position) {
            case 0:
                fragment = new CityFragment();
                break;
            case 1:
                fragment =  new SightsFragment();
                break;
            case 2:
                fragment =  new DiningFragment();
                break;
            case 3:
                fragment =  new HotelFragment();
                break;
            case 4:
                fragment =  new ToursFragment();
                break;
            default:
                fragment = new CityFragment();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return pageCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return tabTitles[0];
        } else if (position == 1) {
            return tabTitles[1];
        } else if (position== 2){
            return tabTitles[2];
        }  else if (position== 3){
            return tabTitles[3];
        }  else
            return tabTitles[4];
    }

}
