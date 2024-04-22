package com.example.myapplication2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Health extends Fragment {
    private List<Item> ItemList = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.business, container, false);

        initItem();

        RecyclerView recyclerView = view.findViewById(R.id.b_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        ListAdapter adapter = new ListAdapter(ItemList, (FragmentActivity) getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }


    private void initItem()
    {
        Item business1 = new Item("联播观察 | 中德领导人会见 习主席强调这一“定位”","https://img0.baidu.com/it/u=743086653,3308529542&fm=253&fmt=auto&app=120&f=JPEG?w=539&h=305");
        ItemList.add(business1);
        Item business2 = new Item("联播观察 | 中德领导人会见 习主席强调这一“定位”","https://img0.baidu.com/it/u=743086653,3308529542&fm=253&fmt=auto&app=120&f=JPEG?w=539&h=305");
        ItemList.add(business2);
        Item business3 = new Item("联播观察 | 中德领导人会见 习主席强调这一“定位”","https://img0.baidu.com/it/u=743086653,3308529542&fm=253&fmt=auto&app=120&f=JPEG?w=539&h=305");
        ItemList.add(business3);
        Item business4 = new Item("联播观察 | 中德领导人会见 习主席强调这一“定位”","https://img0.baidu.com/it/u=743086653,3308529542&fm=253&fmt=auto&app=120&f=JPEG?w=539&h=305");
        ItemList.add(business4);
        Item business5 = new Item("联播观察 | 中德领导人会见 习主席强调这一“定位”","https://img0.baidu.com/it/u=743086653,3308529542&fm=253&fmt=auto&app=120&f=JPEG?w=539&h=305");
        ItemList.add(business5);
        Item business6 = new Item("联播观察 | 中德领导人会见 习主席强调这一“定位”","https://img0.baidu.com/it/u=743086653,3308529542&fm=253&fmt=auto&app=120&f=JPEG?w=539&h=305");
        ItemList.add(business6);
        Item business7 = new Item("联播观察 | 中德领导人会见 习主席强调这一“定位”","https://img0.baidu.com/it/u=743086653,3308529542&fm=253&fmt=auto&app=120&f=JPEG?w=539&h=305");
        ItemList.add(business7);
        Item business8 = new Item("联播观察 | 中德领导人会见 习主席强调这一“定位”","https://img0.baidu.com/it/u=743086653,3308529542&fm=253&fmt=auto&app=120&f=JPEG?w=539&h=305");
        ItemList.add(business8);
    }
}
