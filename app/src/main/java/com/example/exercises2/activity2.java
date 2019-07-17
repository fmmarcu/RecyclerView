package com.example.exercises2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class activity2 extends AppCompatActivity {

    ArrayList<String> contactss=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        initNames();

    }

    protected void initNames() {
        contactss.add("radu");
        contactss.add("dummy");
        contactss.add("andrei");
        contactss.add("stefan");
        contactss.add("alex");
        contactss.add("raducut");

        initRecycleView();

    }

    private void initRecycleView() {
        RecyclerView recyclerView=findViewById(R.id.RecycleView);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(contactss, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
