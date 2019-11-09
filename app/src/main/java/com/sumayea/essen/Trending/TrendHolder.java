package com.sumayea.essen.Trending;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sumayea.essen.R;

public class TrendHolder extends RecyclerView.ViewHolder {


    ImageView mImage;
    TextView mTitle;

    public TrendHolder(@NonNull View itemView) {
        super(itemView);

        this.mImage= itemView.findViewById(R.id.image);
        this.mTitle= itemView.findViewById(R.id.title);

    }
}
