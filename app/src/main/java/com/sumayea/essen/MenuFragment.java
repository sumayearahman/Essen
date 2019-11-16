package com.sumayea.essen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;

public class MenuFragment extends Fragment implements NavigationView.OnNavigationItemSelectedListener {

    private NavigationView navigationView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_menu, container, false);

        navigationView = view.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        return view;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){

            case R.id.nav_profile:
                Intent intent = new Intent(getActivity(), Profile.class);
                startActivity(intent);
                break;


            case R.id.nav_reservation:
                intent = new Intent(getActivity(), MyReservation.class);
                startActivity(intent);
                break;

            case R.id.nav_settings:
                intent = new Intent(getActivity(), Settings.class);
                startActivity(intent);
                break;

            case R.id.nav_rate:
                intent = new Intent(getActivity(),Rate.class);
                startActivity(intent);
                break;

            case R.id.nav_help:
                intent = new Intent(getActivity(), TermOfUse.class);
                startActivity(intent);
                break;


            case R.id.nav_about:
                intent = new Intent(getActivity(), AboutUs.class);
                startActivity(intent);
                break;


        }

        return false;
    }


}
