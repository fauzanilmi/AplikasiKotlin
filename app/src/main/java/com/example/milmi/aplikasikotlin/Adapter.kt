package com.example.milmi.aplikasikotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_cardview.view.*

open class Adapter(val context: Context, val listData: MutableList<Data> = arrayListOf()) : RecyclerView.Adapter<Adapter.AppViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_cardview, parent,false)
        return AppViewHolder(view)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        Glide.with(context)
                .asBitmap()
                .load(listData.get(position).gambar)
                .into(holder.image)
        holder.judul.text = listData.get(position).judul
        holder.genre.text = listData.get(position).genre
        holder.rating.text = listData.get(position).rating
        holder.durasi.text = listData.get(position).durasi


    }

    override fun getItemCount(): Int {
        return listData.size
    }

    class AppViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val image =itemView.findViewById<ImageView>(R.id.image)
        val judul = itemView.findViewById<TextView>(R.id.judul)
        val genre = itemView.findViewById<TextView>(R.id.genre)
        val durasi = itemView.findViewById<TextView>(R.id.durasi)
        val rating = itemView.findViewById<TextView>(R.id.rating)
    }
}

