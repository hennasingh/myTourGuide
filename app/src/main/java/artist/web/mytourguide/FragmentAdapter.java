package artist.web.mytourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by User on 8/25/2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

     private int pageCount =3;
     private Context context;
     private String tabTitles[]= {"City","Sights","Dining"};

     FragmentAdapter (FragmentManager fm, Context context) {
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
        } else {
            return tabTitles[2];
        }
    }

}
