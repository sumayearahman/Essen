package com.sumayea.essen.Category.Japanese;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sumayea.essen.R;

public class JapaneseHolder extends RecyclerView.ViewHolder {


    ImageView mImage;
    TextView mTitle;
    TextView mSubTitle;

    public JapaneseHolder(@NonNull View itemView) {
        super(itemView);

        this.mImage= itemView.findViewById(R.id.image);
        this.mTitle= itemView.findViewById(R.id.title);
        this.mSubTitle= itemView.findViewById(R.id.subTitle);

    }
}
