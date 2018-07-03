package com.example.milmi.aplikasikotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
     var listData: MutableList<Data> = arrayListOf()
     lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = findViewById<RecyclerView>(R.id.recyclerView)
        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this)

        listData.add(Data(
                R.drawable.incredibles2,
                "Incredibles 2",
                "Genre : Animation, Adventure",
                "Durasi : 118 menit",
                "8.3"
        ))
        listData.add(Data(
                R.drawable.avengers3,
                "Avenger Infinity War",
                "Genre : Action, Superhero, Adventure",
                "Durasi : 149 menit",
                "8.7"
        ))
        listData.add(Data(
                R.drawable.images,
                "Jurasic World: Fallen Kingdom",
                "Genre : Adventure, Sci-fi",
                "Durasi : 128 menit",
                "6.6"
        ))
        listData.add(Data(
                R.drawable.antman2,
                "Ant-Man and the Wasp",
                "Genre : Action, Comedy, Superhero, Fantasy",
                "Durasi : 118 menit",
                "8.7"
        ))
        listData.add(Data(
                R.drawable.ironman3,
                "Iron Man 3",
                "Genre : Action, Superhero, Sci-fi",
                "Durasi : 131 menit",
                "7.2"
        ))
        val adapter = Adapter(this, listData)
        rv.adapter = adapter
    }}
