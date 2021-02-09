package com.example.task01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class SongFragment extends Fragment {

    RecyclerView recyclerView;
    List<SongModel> song_List;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_song, container, false);
        recyclerView = view.findViewById(R.id.recycler_song);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new SongItemAdapter(initData()));
        return view;
    }
    public List<SongModel> initData(){
        song_List = new ArrayList<>();
        song_List.add(new SongModel(R.drawable.song, "Song 1"));
        song_List.add(new SongModel(R.drawable.song2, "Song 2"));
        song_List.add(new SongModel(R.drawable.song3, "Song 3"));
        song_List.add(new SongModel(R.drawable.song4, "Song 4"));
        song_List.add(new SongModel(R.drawable.song5, "Song 5"));
        song_List.add(new SongModel(R.drawable.song, "Song 1"));
        song_List.add(new SongModel(R.drawable.song2, "Song 2"));
        song_List.add(new SongModel(R.drawable.song3, "Song 3"));
        song_List.add(new SongModel(R.drawable.song4, "Song 4"));
        song_List.add(new SongModel(R.drawable.song5, "Song 5"));
        return song_List;
    }
}
