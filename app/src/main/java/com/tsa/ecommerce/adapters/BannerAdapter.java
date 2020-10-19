package com.tsa.ecommerce.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.tsa.ecommerce.R;

import java.util.ArrayList;


public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.ViewHolder> {

    private final ArrayList categoryNameList;
    Context context;


    public BannerAdapter(Context context, ArrayList categoryNameList) {
        this.context=context;
        this.categoryNameList = categoryNameList;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.offer_card, parent,false);
        return new ViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {


        Glide.with(context).load("").into(holder.image);


    }

    @Override
    public int getItemCount() {
       return categoryNameList.size();

    }


    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        /////////////////////////

        ViewHolder(@NonNull View view) {
            super(view);

            image=view.findViewById(R.id.image);

           
        }
    }


}
