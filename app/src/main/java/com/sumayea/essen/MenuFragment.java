package com.sumayea.essen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;

public class MenuFragment extends Fragment {

    private NavigationView navigationView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_menu, container, false);

//        navigationView = view.findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) getActivity());
//

        return view;
    }


//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//        switch (menuItem.getItemId()) {
//
//            case R.id.nav_home:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new Home()).commit();
//                break;
//
//            case R.id.nav_about:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new AboutFragment()).commit();
//                break;
//
//
//            case R.id.nav_profile:
//                startActivity((new Intent(this,ProfileFragment.class)));
//                break;
//
//
//            case R.id.nav_add_case:
//                startActivity( new Intent(this, AlarmTestActivity.class));
//                break;
//
//
//            case R.id.nav_case_history:
//                startActivity( new Intent(this, Case_ListActivity.class));
//                break;
//
//            case R.id.nav_help:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, new HelpFragment()).commit();
//                break;
//
//            case R.id.nav_regulatory:
//                startActivity( new Intent(this, RegulatoryActivity.class));
//                break;
//
//            case R.id.nav_warning:
//                startActivity( new Intent(this, WarningActivity.class));
//                break;
//
//
//            case R.id.nav_information:
//                startActivity( new Intent(this, InformationActivity.class));
//                break;
//
//            case R.id.nav_additional:
//                startActivity( new Intent(this, AdditionalActivity.class));
//                break;
//
//            case R.id.nav_traffic:
//                startActivity( new Intent(this, TrafficSignalActivity.class));
//                break;
//
//            case R.id.nav_logout:
//
//
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new hello()).commit();
//                break;
//
//
//        }
//
//
//        return true;
//    }
}
