package com.example.akhil.yogalist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItems> listItems;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        String []Title={"Savaasana","Tadasana","Trikonasana","Urkatasana","Vriksasana","Balasana","Naukasana","Sarvangasana"};
        int []image={R.drawable.savaasana,R.drawable.tadasana,R.drawable.trikonasana,R.drawable.utkatasana,R.drawable.vriksasana,R.drawable.balasana,
                R.drawable.naukasana,R.drawable.sarvangasana
        };

         for(int i=0;i<Title.length;i++){

             listItems.add(new ListItems(Title[i],image[i]));
         }




        adapter=new MyAdapter(listItems,this);
        recyclerView.setAdapter(adapter);



    }
}

