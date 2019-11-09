package com.sumayea.essen;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class HomeFragment extends Fragment {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private PageAdapter pageAdapter;
    private TabItem tabChats;
    private TabItem tabStatus;
    private TabItem tabCalls;

    private ImageButton search;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_home, container, false);



        search= view.findViewById(R.id.search);
        toolbar = view.findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);


//        view.setSupportActionBar(toolbar);

        tabLayout = view.findViewById(R.id.tablayout);
        tabChats = view.findViewById(R.id.tabCat);
        tabStatus = view.findViewById(R.id.tabTrend);
        tabCalls = view.findViewById(R.id.tabOffer);
        tabCalls = view.findViewById(R.id.tabAZ);
        viewPager = view.findViewById(R.id.viewPager);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),SearchActivity.class);
                startActivity(intent);

            }
        });


        pageAdapter = new PageAdapter(getChildFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 1) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(getActivity(),
                            R.color.colorPrimary));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(getActivity(),
                            R.color.colorPrimary));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getActivity().getWindow().setStatusBarColor(ContextCompat.getColor(getActivity(),
                                R.color.colorPrimaryDark));
                    }
                } else if (tab.getPosition() == 2) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(getActivity(),
                            R.color.colorPrimary));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(getActivity(),
                            R.color.colorPrimary));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getActivity().getWindow().setStatusBarColor(ContextCompat.getColor(getActivity(),
                                R.color.colorPrimaryDark));
                    }
                } else {
                    toolbar.setBackgroundColor(ContextCompat.getColor(getActivity(),
                            R.color.colorPrimary));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(getActivity(),
                            R.color.colorPrimary));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getActivity().getWindow().setStatusBarColor(ContextCompat.getColor(getActivity(),
                                R.color.colorPrimaryDark));
                    }
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));




        return view;
    }

}
