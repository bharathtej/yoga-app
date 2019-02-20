package com.example.akhil.recyclerview;

import android.app.LauncherActivity;
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

         listItems = new ArrayList<ListItems>();

      /*   for(int i=0;i<12;i++){
             ListItems listItem=new ListItems(
                     "heading"+(i+1) ,R.drawable.logo);

             listItems.add(listItem);
         }*/

         listItems.add(new ListItems(
                 "Savaasana",R.drawable.savaasana
         ));
        listItems.add(new ListItems(
                "Tadasana",R.drawable.tadasana
        ));
        listItems.add(new ListItems(
                "Trikonasana",R.drawable.trikonasana
        ));
        listItems.add(new ListItems(
                "Utkatasana",R.drawable.utkatasana
        ));
        listItems.add(new ListItems(
                "Vriksasana",R.drawable.vriksasana
        ));




        adapter=new MyAdapter(listItems,this);
         recyclerView.setAdapter(adapter);

    }
}
