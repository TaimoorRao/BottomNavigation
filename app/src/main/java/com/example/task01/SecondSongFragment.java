package com.example.task01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SecondSongFragment extends Fragment {
    Button b;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_second_song, container, false);
        b = v.findViewById(R.id.btnOpen);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirdSongFragment thirdSongFragment = new ThirdSongFragment();

                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame_layout,thirdSongFragment).addToBackStack(null).commit();
            }
        });
        return v;
    }
}