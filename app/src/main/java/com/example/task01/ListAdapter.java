package com.example.task01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private ArrayList<ListItem> mList;

    /**
     * Constructor
     * @param listItem
     */
    public ListAdapter(ArrayList<ListItem> listItem) {
        mList = listItem;
    }

    // Global Initialization
    private OnItemClickListener mListener;

    /**
     * Interface Creation
     */
    public interface OnItemClickListener {
        void onDeleteIconClick(int position);
    }

    /**
     * Setting listener
     * @param listener
     */
    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextView1;
        public ImageView mDeleteIcon;
        public ListViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            mTextView1 = itemView.findViewById(R.id.item_Added_Text);
            mDeleteIcon = itemView.findViewById(R.id.image_delete);
            mDeleteIcon.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onDeleteIconClick(position);
                        }
                    }
                }
            });
        }
    }

    @NonNull
    @Override
    public ListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ListViewHolder lvh = new ListViewHolder(v, mListener);
        return lvh;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ListViewHolder holder, int position) {
        ListItem currentItem = mList.get(position);
        holder.mTextView1.setText(currentItem.getItemText());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
