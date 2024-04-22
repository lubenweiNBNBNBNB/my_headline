package com.example.myapplication2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import androidx.fragment.app.Fragment;

import java.util.List;

public class NewsClassAdapter extends RecyclerView.Adapter<NewsClassAdapter.ViewHolder>{
    private List<NewsClass>mNCList;
    private FragmentActivity mActivity;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View fruitView;
        ImageView NCImage;
        TextView NCName;
        public ViewHolder(View view){
            super(view);
            fruitView = view;
            NCImage = (ImageView) view.findViewById(R.id.nc_image);
            NCName = (TextView) view.findViewById(R.id.nc_name);
        }
    }

    public NewsClassAdapter(List<NewsClass> NClist,FragmentActivity activity)
    {
        mNCList = NClist;
        mActivity = activity;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.new_class_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.fruitView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                NewsClass nc = mNCList.get(position);
                Toast.makeText(v.getContext(),"you clicked view " + nc.getName(),Toast.LENGTH_LONG).show();


                if(nc.getName() == "Business")
                    replaceFragment(new BusinessFragment());
                if(nc.getName() == "Entertainment")
                    replaceFragment(new Entertainment());
                if(nc.getName() == "Health")
                    replaceFragment(new Health());
                if(nc.getName() == "Science")
                    replaceFragment(new Science());
                if(nc.getName() == "Sports")
                    replaceFragment(new Sports());
            }
        });
        holder.NCImage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int position = holder.getAdapterPosition();
                NewsClass nc = mNCList.get(position);
                //replaceFragment(new BusinessFragment());
                Toast.makeText(v.getContext(),"you clicked image " + nc.getName(),Toast.LENGTH_LONG).show();


                if(nc.getName() == "Business")
                    replaceFragment(new BusinessFragment());
                if(nc.getName() == "Entertainment")
                    replaceFragment(new Entertainment());
                if(nc.getName() == "Health")
                    replaceFragment(new Health());
                if(nc.getName() == "Science")
                    replaceFragment(new Science());
                if(nc.getName() == "Sports")
                    replaceFragment(new Sports());
            }
        });



        return holder;
    }

    private void replaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = mActivity.getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.list, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        NewsClass nc = mNCList.get(position);
        holder.NCImage.setImageResource(nc.getImageId());
        holder.NCName.setText(nc.getName());
    }

    @Override
    public int getItemCount(){
        return mNCList.size();
    }
}
