package com.example.task01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

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
                    View b = findViewById(R.id.text_Main);
                    b.setVisibility(View.GONE);
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
                    /**
                     * If we want to bind one or more fragments on activity we use FragmentManager class
                     * This class provide access of fragment like interchanging, binding, add or replace fragments.
                     */
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    /**
                     * Transaction performed in between two and multiple fragments by .beginTransaction() Method
                     * Add fragment on activity or remove by .replace() Method
                     * If we want to bind another fragment on a fragment that is already bind on activity we use .addToBackStack() method
                     * .commit() method helps to store and save every state
                     */
                    fragmentManager.beginTransaction().replace(R.id.frame_layout,selectFragment).addToBackStack(null).commit();
                    return true;
                }
            };
}