package com.example.task01;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ArtistItemAdapter extends RecyclerView.Adapter<ArtistItemAdapter.ViewHolder> {
    Context c;

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
        ArtistModel model = artist_List.get(position);
        holder.artist_Image.setImageResource(model.getItem_Image());
        holder.item_Text1.setText(model.getItem_Text1());
        holder.item_Text2.setText(model.getItem_Text2());
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View view = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.custom_dialog,null);
                de.hdodenhof.circleimageview.CircleImageView dialogbox_image;
                TextView dialogbox_name;
                TextView dialogbox_artist_description;
                TextView dialogbox_description;
                dialogbox_image = view.findViewById(R.id.artist_dialogbox_image);
                dialogbox_name = view.findViewById(R.id.artist_dialogbox_name);
                dialogbox_artist_description = view.findViewById(R.id.artist_dialogbox_description);
                dialogbox_description = view.findViewById(R.id.dialogbox_description);
                dialogbox_image.setImageResource(model.getItem_Image());
                dialogbox_name.setText(model.getItem_Text1());
                dialogbox_artist_description.setText(model.getItem_Text2());
                dialogbox_description.setText(model.getDescription());
                builder.setView(view).setTitle("Artist Dialog Box")
                        .setNegativeButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return artist_List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        de.hdodenhof.circleimageview.CircleImageView artist_Image;
        TextView item_Text1;
        TextView item_Text2;
        Button btn;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            artist_Image = itemView.findViewById(R.id.item_image);
            item_Text1 = itemView.findViewById(R.id.artist_text1);
            item_Text2 = itemView.findViewById(R.id.artist_text2);
            btn = itemView.findViewById(R.id.btn_click);
        }
    }
}
