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

import com.squareup.picasso.Picasso;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    private List<Item>mNCList;
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

    public ListAdapter(List<Item> NClist,FragmentActivity activity)
    {
        mNCList = NClist;
        mActivity = activity;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.new_class_item2,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.fruitView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Item nc = mNCList.get(position);

                Toast.makeText(v.getContext(),"you clicked view " + nc.getName(),Toast.LENGTH_LONG).show();


            }
        });
        holder.NCImage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int position = holder.getAdapterPosition();
                Item nc = mNCList.get(position);

                Toast.makeText(v.getContext(),"you clicked image " + nc.getName(),Toast.LENGTH_LONG).show();

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
        Item nc = mNCList.get(position);
        //holder.NCImage.setImageResource(nc.getImageId());
        Picasso.get().load(nc.getImageId()).into(holder.NCImage);
        holder.NCName.setText(nc.getName());
    }

    @Override
    public int getItemCount(){
        return mNCList.size();
    }
}
