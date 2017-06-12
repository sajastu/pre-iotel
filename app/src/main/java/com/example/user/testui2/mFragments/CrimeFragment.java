package com.example.user.testui2.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.testui2.R;
import com.example.user.testui2.mRecycler.MyAdapter;

/**
 * Created by user on 6/12/2017.
 */

public class CrimeFragment extends Fragment {
    private String[] crime = {"BlackList","Inception","crime3","crime4","Crime5"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.crime_fragment, container, false);
        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.crimeRV);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        MyAdapter adapter = new MyAdapter(this.getActivity(), crime);
        rv.setAdapter(adapter);
        return rootView;
    }
}
