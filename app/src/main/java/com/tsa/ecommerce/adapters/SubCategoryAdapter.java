package com.tsa.ecommerce.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tsa.ecommerce.R;
import com.tsa.ecommerce.interfaces.ChooseCategory;
import com.tsa.ecommerce.models.CategoryNameModel;

import java.util.ArrayList;


public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.ViewHolder> {

    private final ArrayList<CategoryNameModel> categoryNameList;
    Context context;

    ChooseCategory chooseCategoryCallback;


    public SubCategoryAdapter(Context context, ArrayList<CategoryNameModel> categoryNameList) {
        this.context=context;
        this.categoryNameList = categoryNameList;
        chooseCategoryCallback= (ChooseCategory) context;

    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sub_category_card, parent,false);
        return new ViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {





        holder.subCategoryLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseCategoryCallback.onSubCategoryClick(context);
            }
        });

        holder.viewProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseCategoryCallback.onViewProductsClick(context, position);
            }
        });

    }

    @Override
    public int getItemCount() {
     //   return categoryNameList.size();
        return 10;
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        /////////////////////////

        TextView viewProducts;
        LinearLayout subCategoryLayout;
       
        /////////////////////////

        ViewHolder(@NonNull View view) {
            super(view);
            subCategoryLayout=view.findViewById(R.id.subCategoryLayout);
            viewProducts=view.findViewById(R.id.viewProducts);

           
        }
    }


}
