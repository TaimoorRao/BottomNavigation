package com.example.task01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class AlbumFragment extends Fragment {
    Button btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_album, container, false);
        btn = v.findViewById(R.id.btnOpenSecond);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SecondAlbumFragment secondAlbumFragment = new SecondAlbumFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame_layout,secondAlbumFragment).addToBackStack(null).commit();
            }
        });
        return v;
    }
}
