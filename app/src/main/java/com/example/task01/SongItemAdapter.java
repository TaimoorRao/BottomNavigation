package com.example.task01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SongItemAdapter extends RecyclerView.Adapter<SongItemAdapter.ViewHolder> {

    List<SongModel> item_List;
    public SongItemAdapter(List<SongModel> list) {
        this.item_List = list;
    }

    @NonNull
    @Override
    public SongItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.songitem, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SongItemAdapter.ViewHolder holder, int position) {
        holder.item_Image.setImageResource(item_List.get(position).getItem_Image());
        holder.item_Text.setText(item_List.get(position).getItem_Text());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position == 0){
                    /**
                     * AppCompatActivity inherits from FragmentActivity
                     * so if we need to handle Fragments we can using the Fragment Manager.
                     */
                    AppCompatActivity activity = (AppCompatActivity)v.getContext();
                    SecondSongFragment secondSongFragment = new SecondSongFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,secondSongFragment).addToBackStack(null).commit();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return item_List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView item_Image;
        TextView item_Text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_Image = itemView.findViewById(R.id.item_image);
            item_Text = itemView.findViewById(R.id.item_text);
        }
    }
}
