package com.tsa.ecommerce.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tsa.ecommerce.R;
import com.tsa.ecommerce.models.CategoryNameModel;

import java.util.ArrayList;


public class ProductListingAdapter extends RecyclerView.Adapter<ProductListingAdapter.ViewHolder> {

    private final ArrayList<CategoryNameModel> categoryNameList;
    Context context;


    public ProductListingAdapter(Context context, ArrayList<CategoryNameModel> categoryNameList) {
        this.context=context;
        this.categoryNameList = categoryNameList;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_card, parent,false);
        return new ViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {



    }

    @Override
    public int getItemCount() {
       return categoryNameList.size();

    }


    class ViewHolder extends RecyclerView.ViewHolder {

        ViewHolder(@NonNull View view) {
            super(view);


           
        }
    }


}
