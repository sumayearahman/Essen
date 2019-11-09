package com.sumayea.essen;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sumayea.essen.Category.CategoryFragment;
import com.sumayea.essen.Offer.NewFragment;
import com.sumayea.essen.Trending.TopFragment;

public class PageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;




    public PageAdapter( FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs= numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new CategoryFragment();

            case 1:
                return new TopFragment();

            case 2:
                return new NewFragment();

            case 3:
                return new AZFragment();

            default:

                return null;
        }

    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
