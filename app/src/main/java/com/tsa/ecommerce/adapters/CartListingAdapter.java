package com.tsa.ecommerce.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tsa.ecommerce.R;
import com.tsa.ecommerce.models.CategoryNameModel;

import java.util.ArrayList;


public class CartListingAdapter extends RecyclerView.Adapter<CartListingAdapter.ViewHolder> {

    private final ArrayList<CategoryNameModel> categoryNameList;
    Context context;


    public CartListingAdapter(Context context, ArrayList<CategoryNameModel> categoryNameList) {
        this.context=context;
        this.categoryNameList = categoryNameList;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_card, parent,false);
        return new ViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {



    }

    @Override
    public int getItemCount() {
     //   return categoryNameList.size();
        return 10;
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image,remove,minus,plus;
        TextView title,brand,quantityValue,price;
        /////////////////////////

        ViewHolder(@NonNull View view) {
            super(view);

            image=view.findViewById(R.id.image);
            title=view.findViewById(R.id.title);
            remove=view.findViewById(R.id.remove);
            minus=view.findViewById(R.id.minus);
            brand=view.findViewById(R.id.brand);
            quantityValue=view.findViewById(R.id.quantityValue);
            plus=view.findViewById(R.id.plus);
            price=view.findViewById(R.id.price);

           
        }
    }


}
