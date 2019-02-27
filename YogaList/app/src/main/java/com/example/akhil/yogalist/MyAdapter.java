package com.example.akhil.yogalist;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    public List<ListItems> listItems;
    public Context context;


    public MyAdapter( List<ListItems> listItems, Context context ) {
        this.listItems = listItems;
        this.context = context;
    }



    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View v=LayoutInflater.from(context)
                .inflate(R.layout.cardview,parent,false);

        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder( @NonNull MyAdapter.ViewHolder holder, final int position ) {
        final ListItems listitem=listItems.get(position);
        holder.textViewHead.setText(listitem.getHead());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(listitem.getImage()));
        holder.relativelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent=new Intent(context,Activity2.class);
                intent.putExtra("imageView",listitem.getImage());
                context.startActivity(intent);
            }
        });
        }




    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewHead;
        public ImageView imageView;
        public RelativeLayout relativelayout;

        public ViewHolder( @NonNull View itemView ) {
            super(itemView);

            textViewHead=itemView.findViewById(R.id.heading);
            imageView=itemView.findViewById(R.id.image);
            relativelayout=itemView.findViewById(R.id.relative);
        }
    }
}


