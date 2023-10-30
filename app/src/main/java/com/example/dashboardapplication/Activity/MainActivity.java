package com.example.dashboardapplication.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dashboardapplication.Adapter.TrendsAdapter;
import com.example.dashboardapplication.Domain.TrendsDomain;
import com.example.dashboardapplication.R;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterTrendsList;
    private RecyclerView recyclerViewTrends;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    @SuppressLint("WrongViewCast")
    private void initRecyclerView() {
        ArrayList<TrendsDomain> items=new ArrayList<>();

        items.add(new TrendsDomain("Future in AI, What will tomorrow be like?", "The National", "trends"));
        items.add(new TrendsDomain("Important points in concluding a work contract", "Reuters", "trends2"));
        items.add(new TrendsDomain("Future in AI, What will tomorrow be like?", "The National", "trends"));

        recyclerViewTrends=findViewById(R.id.view1);
        recyclerViewTrends.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterTrendsList=new TrendsAdapter(items);
        recyclerViewTrends.setAdapter(adapterTrendsList);
    }
}