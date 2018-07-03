package com.example.milmi.aplikasikotlin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.AppViewHolder> {

    private Context context;
    private List<Data> listData;

    public Adapter(Context context, List<Data> listData) {
        this.context = context;
        this.listData = listData;
    }


    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_cardview, null);
        return new AppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        Data data = listData.get(position);
        holder.judul.setText(data.getJudul());
        holder.genre.setText(data.getGenre());
        holder.rating.setText(data.getRating());
        holder.image.setImageDrawable(context.getResources().getDrawable(data.getGambar()));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class AppViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView judul, genre, rating;

        public AppViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            judul = itemView.findViewById(R.id.judul);
            genre = itemView.findViewById(R.id.genre);
            rating = itemView.findViewById(R.id.rating);


        }
    }
}
