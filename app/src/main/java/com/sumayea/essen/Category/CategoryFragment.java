package com.sumayea.essen.Category;

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

import com.sumayea.essen.R;

import java.util.ArrayList;
import java.util.List;


public class CategoryFragment extends Fragment {

    View v;
    RecyclerView mRecyclerview;
    Adapter catAdapter;
    List <Model> mData;

    public CategoryFragment(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_category, container, false);

        mRecyclerview= view.findViewById(R.id.recycler_view);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));


        CatRec_Adapter catRec_adapter = new CatRec_Adapter(getContext(),mData);
        mRecyclerview.setAdapter(catRec_adapter);


        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mData= new ArrayList<>();
        mData.add(new Model("Japanese", R.drawable.n));
        mData.add(new Model("Italian", R.drawable.b));
        mData.add(new Model("Thai", R.drawable.c));
        mData.add(new Model("Italian", R.drawable.d));
        mData.add(new Model("Italian", R.drawable.e));
        mData.add(new Model("Italian", R.drawable.g));
        mData.add(new Model("Buffet", R.drawable.h));
        mData.add(new Model("Food Court", R.drawable.i));
        mData.add(new Model("Chineese", R.drawable.j));
        mData.add(new Model("Offer", R.drawable.k));
        mData.add(new Model("Chineese", R.drawable.l));

    }
}
