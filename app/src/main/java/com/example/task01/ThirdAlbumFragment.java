package com.example.task01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class ThirdAlbumFragment extends Fragment {

//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        OnBackPressedCallback callback = new OnBackPressedCallback(true ) {
//            @Override
//            public void handleOnBackPressed() {
//                FragmentManager fm= getFragmentManager();
//                if (fm != null) {
//                    if (fm.getBackStackEntryCount() > 0) {
//                        fm.popBackStack();
//                    }
//                }
//            }
//        };
//        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
//        super.onCreate(savedInstanceState);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third_album, container, false);
    }
}