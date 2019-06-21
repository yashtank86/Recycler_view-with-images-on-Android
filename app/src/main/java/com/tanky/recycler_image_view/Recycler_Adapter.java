package com.tanky.recycler_image_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Recycler_Adapter extends RecyclerView.Adapter<Recycler_Adapter.Image_view_Holder> {

    private int[] images;
    public Recycler_Adapter(int[] images){
        this.images = images;
    }


    @NonNull
    @Override
    public Image_view_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.albums_images,parent,false);
        Image_view_Holder  image_view_holder = new Image_view_Holder(view);
        return image_view_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Image_view_Holder holder, int position) {
        int image_id = images[position];
        holder.Album.setImageResource(image_id);
        holder.Albums_title.setText("photos : "+position);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class Image_view_Holder extends RecyclerView.ViewHolder {

        ImageView Album;
        TextView Albums_title;

        public Image_view_Holder(@NonNull View itemView) {
            super(itemView);
            Album = itemView.findViewById(R.id.albums);
            Albums_title = itemView.findViewById(R.id.albums_titles);
        }
    }
}
