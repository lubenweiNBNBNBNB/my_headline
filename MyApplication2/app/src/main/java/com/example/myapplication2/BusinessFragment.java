package com.example.myapplication2;

import static java.security.AccessController.getContext;

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

public class BusinessFragment extends Fragment {
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
        Item business2 = new Item("美媒：拜登政府施压巴总统要求放弃申请成为联合国正式会员国，被拒","https://inews.gtimg.com/news_ls/Om5mHjwAbXUd-Fh64zer_0qX-h1RM7vxeaz4TH2AGeNS8AA_294195/0");
        ItemList.add(business2);
        Item business3 = new Item("外交部：中方欢迎美国国务卿布林肯近日访华","https://inews.gtimg.com/om_bt/O2DrVuOOouTD4kDukgU7mx50c32On21L71crj6HWu3uuQAA/641");
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
