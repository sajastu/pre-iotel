package com.example.user.testui2.mRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.testui2.R;

/**
 * Created by user on 6/12/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    String[] movies;

    public MyAdapter(Context c, String[] movies) {
        this.c = c;
        this.movies = movies;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.nametxt.setText(movies[position]);
    }

    @Override
    public int getItemCount() {
        return movies.length;
    }
}
