package com.sumayea.essen.Offer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sumayea.essen.Category.Model;
import com.sumayea.essen.R;

import java.util.List;

public class OfferRec_Adapter extends RecyclerView.Adapter<OfferRec_Adapter.OfferHolder> {

    Context c;
    List <Model> mData;

    public OfferRec_Adapter(Context c, List<Model>mData){
        this.c= c;
        this.mData= mData;
    }



    @NonNull
    @Override
    public OfferHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(c).inflate(R.layout.cat_rec_model,parent,false);
        OfferHolder offerHolder = new OfferHolder(v);
        return  offerHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OfferHolder holder, int i) {

        holder.title.setText(mData.get(i).getTitle());
        holder.img.setImageResource(mData.get(i).getImg());

//        Animation animation = AnimationUtils.loadAnimation(c, android.R.anim.slide_in_left);
//        holder.itemView.setAnimation(animation);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class OfferHolder extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView title;

        public OfferHolder( View itemView) {
            super(itemView);


            title= (TextView)itemView.findViewById(R.id.title);
            img= (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
