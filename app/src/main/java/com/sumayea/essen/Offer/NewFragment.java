package com.sumayea.essen.Offer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.sumayea.essen.Category.Model;
import com.sumayea.essen.R;
import com.sumayea.essen.Trending.TrendRec_Adapter;

import java.util.ArrayList;
import java.util.List;


public class NewFragment extends Fragment {

    View v;
    RecyclerView mRecyclerview;
    Adapter offerHolder;
    List <Model> mData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_new, container, false);


        mRecyclerview= view.findViewById(R.id.recycler_view);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));


        OfferRec_Adapter offerRec_adapter = new OfferRec_Adapter(getContext(),mData);
        mRecyclerview.setAdapter(offerRec_adapter);


        return view;


    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mData= new ArrayList <>();

        mData.add(new Model("Italian", R.drawable.g));
        mData.add(new Model("Offer", R.drawable.k));


    }


}
