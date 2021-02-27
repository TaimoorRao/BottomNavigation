package com.example.task01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListFragment extends Fragment implements BottomSheetDialog.BottomSheetListener {
    private ArrayList<ListItem> mList;
    private RecyclerView mRecyclerView;
    private ListAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button btn_click_open_dialog = (Button) getView().findViewById(R.id.btn_open_dialog);
        btn_click_open_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog();
                bottomSheetDialog.show(getChildFragmentManager(), bottomSheetDialog.getTag());
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list,container,false);

//        Button btn_click_open_dialog = view.findViewById(R.id.btn_open_dialog);
//        btn_click_open_dialog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog();
//                bottomSheetDialog.show(getChildFragmentManager(), bottomSheetDialog.getTag());
//            }
//        });

        createItemList();
        mRecyclerView = view.findViewById(R.id.recycler_list);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new ListAdapter(mList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        /**
         * Interface Methods Definitions
         */
        mAdapter.setOnItemClickListener(new ListAdapter.OnItemClickListener() {
            @Override
            public void onDeleteIconClick(int position) {
                removeItem(position);
            }
        });
        return view;
    }

    public void createItemList() {
        mList = new ArrayList<>();
        mList.add(new ListItem("Apple"));
        mList.add(new ListItem("Onion"));
        mList.add(new ListItem("Peanut"));
    }

    public void removeItem(int position) {
        mList.remove(position);
        mAdapter.notifyItemRemoved(position);
    }

    @Override
    public void onButtonClicked(String text) {
        mList.add(new ListItem(text));
    }

}
