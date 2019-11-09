package com.sumayea.essen.Category.Japanese;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.sumayea.essen.Category.Model;
import com.sumayea.essen.R;

import java.util.List;

public class JapaneseRec_Adapter extends RecyclerView.Adapter<JapaneseRec_Adapter.JapaneseHolder> {

    Context c;
    List <Model> mData;

    public JapaneseRec_Adapter(Context c, List<Model>mData){
        this.c= c;
        this.mData= mData;
    }



    @NonNull
    @Override
    public JapaneseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(c).inflate(R.layout.cat_rec_model,parent,false);
        JapaneseHolder japaneseHolder = new JapaneseHolder(v);

        japaneseHolder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(c, "I am working", Toast.LENGTH_LONG).show();


            }
        });
        return  japaneseHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull JapaneseHolder holder, int i) {

        holder.title.setText(mData.get(i).getTitle());
        holder.subTitle.setText(mData.get(i).getTitle());
        holder.img.setImageResource(mData.get(i).getImg());

//        Animation animation = AnimationUtils.loadAnimation(c, android.R.anim.slide_in_left);
//        holder.itemView.setAnimation(animation);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class JapaneseHolder extends RecyclerView.ViewHolder {

        private CardView item;
        private ImageView img;
        private TextView title;
        private TextView subTitle;

        public JapaneseHolder( View itemView) {
            super(itemView);

            item=(CardView) itemView.findViewById(R.id.item);
            title= (TextView)itemView.findViewById(R.id.title);
            subTitle=(TextView)itemView.findViewById(R.id.subTitle);
            img= (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
