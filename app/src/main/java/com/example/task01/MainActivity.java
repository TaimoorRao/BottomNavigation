package com.example.task01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectFragment = null;
                    switch (item.getItemId()){
                        case R.id.nav_song:
                            selectFragment = new SongFragment();
                            break;
                        case R.id.nav_album:
                            selectFragment = new AlbumFragment();
                            break;
                        case R.id.nav_artist:
                            selectFragment = new ArtistFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,selectFragment).commit();
                    return true;
                }
            };
}