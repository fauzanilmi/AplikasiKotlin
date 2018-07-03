package com.example.milmi.aplikasikotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List <Data> listData;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listData = new ArrayList<>();

        listData.add(
                new Data(
                        R.drawable.incredibles2,
                        "Incredibles 2",
                        "Genre : Animation, Adventure",
                        "Durasi : 118 menit",
                        "8.3"
                        ));

        listData.add(
                new Data(
                        R.drawable.avengers3,
                        "Avenger Infinity War",
                        "Genre : Action, Superhero, Adventure",
                        "Durasi : 149 menit",
                        "8.7"
                ));

        listData.add(
                new Data(
                        R.drawable.images,
                        "Jurasic World: Fallen Kingdom",
                        "Genre : Adventure, Sci-fi",
                        "Durasi : 128 menit",
                        "6.6"
                ));

        listData.add(
                new Data(
                        R.drawable.antman2,
                        "Ant-Man and the Wasp",
                        "Genre : Action, Comedy, Superhero, Fantasy",
                        "Durasi : 118 menit",
                        "8.7"
                ));

        listData.add(
                new Data(
                        R.drawable.ironman3,
                        "Iron Man 3",
                        "Genre : Action, Superhero, Sci-fi",
                        "Durasi : 131 menit",
                        "7.2"
                ));
        Adapter adapter = new Adapter(this, listData);
        recyclerView.setAdapter(adapter);

    }
}
