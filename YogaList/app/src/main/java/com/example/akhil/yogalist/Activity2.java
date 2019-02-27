package com.example.akhil.yogalist;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView name1;
    ImageView image1;
    int image;
    String notice;

    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        image1=findViewById(R.id.image1);
        name1=findViewById(R.id.name);
        image=getIntent().getIntExtra("imageView",0);
        notice="Coming Soon!";
        image1.setImageResource(image);
        name1.setText(notice);
    }
}