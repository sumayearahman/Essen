package com.sumayea.essen.Offer;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sumayea.essen.R;

public class OfferHolder extends RecyclerView.ViewHolder {


    ImageView mImage;
    TextView mTitle;

    public OfferHolder(@NonNull View itemView) {
        super(itemView);

        this.mImage= itemView.findViewById(R.id.image);
        this.mTitle= itemView.findViewById(R.id.title);

    }
}
