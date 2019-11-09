package com.sumayea.essen.Trending;

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

public class TrendRec_Adapter extends RecyclerView.Adapter<TrendRec_Adapter.TrendHolder> {

    Context c;
    List <Model> mData;

    public TrendRec_Adapter(Context c, List<Model>mData){
        this.c= c;
        this.mData= mData;
    }



    @NonNull
    @Override
    public TrendHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(c).inflate(R.layout.cat_rec_model,parent,false);
        TrendHolder trendHolder = new TrendHolder(v);
        return  trendHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TrendHolder holder, int i) {

        holder.title.setText(mData.get(i).getTitle());
        holder.img.setImageResource(mData.get(i).getImg());

//        Animation animation = AnimationUtils.loadAnimation(c, android.R.anim.slide_in_left);
//        holder.itemView.setAnimation(animation);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class TrendHolder extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView title;

        public TrendHolder( View itemView) {
            super(itemView);


            title= (TextView)itemView.findViewById(R.id.title);
            img= (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
