package com.sumayea.essen.Category;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.sumayea.essen.R;

import java.util.ArrayList;
import java.util.List;

public class CatRec_Adapter extends RecyclerView.Adapter<CatRec_Adapter.CatHolder> {

    Context c;
    List <Model> mData;

    public CatRec_Adapter (Context c, List<Model>mData){
        this.c= c;
        this.mData= mData;
    }



    @NonNull
    @Override
    public CatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(c).inflate(R.layout.cat_rec_model,parent,false);
        CatHolder catHolder = new CatHolder(v);

        catHolder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(c, "I am working", Toast.LENGTH_LONG).show();


            }
        });
        return  catHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CatHolder holder, int i) {

        holder.title.setText(mData.get(i).getTitle());
        holder.img.setImageResource(mData.get(i).getImg());

//        Animation animation = AnimationUtils.loadAnimation(c, android.R.anim.slide_in_left);
//        holder.itemView.setAnimation(animation);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class CatHolder extends RecyclerView.ViewHolder {

        private CardView item;
        private ImageView img;
        private TextView title;

        public CatHolder( View itemView) {
            super(itemView);

            item=(CardView) itemView.findViewById(R.id.item);
            title= (TextView)itemView.findViewById(R.id.title);
            img= (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
