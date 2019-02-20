package com.example.akhil.recyclerview;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<ListItems> listItems;
    private Context context;


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
    public void onBindViewHolder( @NonNull MyAdapter.ViewHolder holder, int position ) {
        ListItems listitem=listItems.get(position);
        holder.textViewHead.setText(listitem.getHead());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(listitem.getImage()));

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewHead;
        public ImageView imageView;

        public ViewHolder( @NonNull View itemView ) {
            super(itemView);

             textViewHead=itemView.findViewById(R.id.heading);
             imageView=itemView.findViewById(R.id.image);
        }
    }
}

