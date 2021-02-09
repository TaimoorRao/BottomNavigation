package com.example.task01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ArtistItemAdapter extends RecyclerView.Adapter<ArtistItemAdapter.ViewHolder> {

    List<ArtistModel> artist_List;
    public ArtistItemAdapter(List<ArtistModel> list) {
        this.artist_List = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.artistitem, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.artist_Image.setImageResource(artist_List.get(position).getItem_Image());
        holder.item_Text1.setText(artist_List.get(position).getItem_Text1());
        holder.item_Text2.setText(artist_List.get(position).getItem_Text2());
    }

    @Override
    public int getItemCount() {
        return artist_List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView artist_Image;
        TextView item_Text1;
        TextView item_Text2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            artist_Image = itemView.findViewById(R.id.item_image);
            item_Text1 = itemView.findViewById(R.id.artist_text1);
            item_Text2 = itemView.findViewById(R.id.artist_text2);
        }
    }
}
