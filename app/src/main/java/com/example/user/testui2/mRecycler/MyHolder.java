package com.example.user.testui2.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.user.testui2.R;

/**
 * Created by user on 6/12/2017.
 */

public class MyHolder extends RecyclerView.ViewHolder {
    TextView nametxt;

    public MyHolder(View itemView) {
        super(itemView);
        nametxt = (TextView) itemView.findViewById(R.id.nameTxt);
    }
}
