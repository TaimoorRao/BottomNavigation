package com.example.task01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SecondAlbumFragment extends Fragment {
    Button btn;
    public SecondAlbumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_second_album, container, false);
        btn = v.findViewById(R.id.btnOpenThird);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirdAlbumFragment thirdAlbumFragment = new ThirdAlbumFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame_layout,thirdAlbumFragment).addToBackStack(null).commit();
            }
        });
        return v;
    }
}