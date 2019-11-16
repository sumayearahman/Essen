package com.sumayea.essen;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sumayea.essen.Category.CategoryFragment;
import com.sumayea.essen.Offer.NewFragment;
import com.sumayea.essen.Trending.TopFragment;

public class ProfileAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public ProfileAdapter( FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new LoginFragment();

            case 1:
                return new RegisterFragment();

            default:

                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
