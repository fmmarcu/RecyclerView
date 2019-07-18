package com.example.exercises2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private ArrayList<String> mcontacts=new ArrayList<>();
    private Context mcontext;

    RecyclerViewAdapter(ArrayList<String> contacts, Context context) {
        mcontacts=contacts;
        mcontext=context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.textimg.setText(mcontacts.get(position));
        holder.baseLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mcontext, mcontacts.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mcontacts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textimg;
        RelativeLayout baseLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textimg=itemView.findViewById(R.id.textimg);
            baseLayout=itemView.findViewById(R.id.itemlayout);
        }
    }
}
