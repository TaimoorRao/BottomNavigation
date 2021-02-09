package com.example.task01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ArtistFragment extends Fragment {
    RecyclerView recyclerView;
    List<ArtistModel> artist_List;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_artist, container, false);
        recyclerView = view.findViewById(R.id.recycler_artist);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new ArtistItemAdapter(initData()));
        return view;
    }
    public List<ArtistModel> initData(){
        artist_List = new ArrayList<>();
        artist_List.add(new ArtistModel(R.drawable.artist1, "Artist 1","Khalid"));
        artist_List.add(new ArtistModel(R.drawable.artist2, "Artist 2","Micheal Jackson"));
        artist_List.add(new ArtistModel(R.drawable.artist3, "Artist 3","Shawn Mandes"));
        artist_List.add(new ArtistModel(R.drawable.artist4, "Artist 4","Billie"));
        artist_List.add(new ArtistModel(R.drawable.artist5, "Artist 5","Taylor"));
        return artist_List;
    }
}
