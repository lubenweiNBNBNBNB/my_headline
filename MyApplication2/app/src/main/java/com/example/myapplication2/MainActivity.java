package com.example.myapplication2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.util.LogPrinter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication2.R;
import com.example.myapplication2.NewsClassAdapter;
import com.example.myapplication2.NewsClass;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<NewsClass> NewsClassList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initNC();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);//垂直
        recyclerView.setLayoutManager(layoutManager);
        //适配器
        NewsClassAdapter adapter = new NewsClassAdapter(NewsClassList,this);
        recyclerView.setAdapter(adapter);

    }

    private void initNC()
    {
        NewsClass business = new NewsClass("Business",R.drawable.business);
        NewsClassList.add(business);
        NewsClass entertainment = new NewsClass("Entertainment",R.drawable.entertainment);
        NewsClassList.add(entertainment);
        NewsClass health = new NewsClass("Health",R.drawable.health);
        NewsClassList.add(health);
        NewsClass science = new NewsClass("Science",R.drawable.science);
        NewsClassList.add(science);
        NewsClass sports = new NewsClass("Sports",R.drawable.sports);
        NewsClassList.add(sports);
    }


}