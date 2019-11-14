package com.sumayea.essen.Category.Japanese;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

import com.sumayea.essen.Category.Japanese.JapaneseRec_Adapter;
import com.sumayea.essen.Category.Model;
import com.sumayea.essen.R;

import java.util.ArrayList;
import java.util.List;

public class Restaurent_List_Activity extends AppCompatActivity {


    View v;
    RecyclerView mRecyclerview;
    Adapter japaneseHolder;
    List <Model_J> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurent__list_);


        mRecyclerview= findViewById(R.id.recycler_view);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(getApplication()));


        JapaneseRec_Adapter japaneseRec_adapter = new JapaneseRec_Adapter(getApplicationContext(),mData);
        mRecyclerview.setAdapter(japaneseRec_adapter);


       mData= new ArrayList <>();
       mData.add(new Model_J("Japanese","japanese",R.drawable.a));
       mData.add(new Model_J("Japanese","japanese",R.drawable.b));
       mData.add(new Model_J("Japanese","japanese",R.drawable.a));
       mData.add(new Model_J("Japanese","japanese",R.drawable.a));
       mData.add(new Model_J("Japanese","japanese",R.drawable.a));
       mData.add(new Model_J("Japanese","japanese",R.drawable.a));
       mData.add(new Model_J("Japanese","japanese",R.drawable.a));
       mData.add(new Model_J("Japanese","japanese",R.drawable.a));
       mData.add(new Model_J("Japanese","japanese",R.drawable.a));
       mData.add(new Model_J("Japanese","japanese",R.drawable.a));
       mData.add(new Model_J("Japanese","japanese",R.drawable.a));
       mData.add(new Model_J("Japanese","japanese",R.drawable.a));
    }


//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        mData= new ArrayList <>();
//        mData.add(new Model("Japanese", R.drawable.a));
//        mData.add(new Model("Italian", R.drawable.b));
//        mData.add(new Model("Thai", R.drawable.c));
//        mData.add(new Model("Italian", R.drawable.d));
//        mData.add(new Model("Italian", R.drawable.e));
//        mData.add(new Model("Italian", R.drawable.g));
//        mData.add(new Model("Buffet", R.drawable.h));
//        mData.add(new Model("Food Court", R.drawable.i));
//        mData.add(new Model("Chineese", R.drawable.j));
//        mData.add(new Model("Offer", R.drawable.k));
//        mData.add(new Model("Chineese", R.drawable.l));
//
//    }
}
