package com.tsa.ecommerce.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tsa.ecommerce.R;
import com.tsa.ecommerce.activity.SubCategoryActivity;
import com.tsa.ecommerce.interfaces.ChooseCategory;
import com.tsa.ecommerce.models.CategoryNameModel;

import java.util.ArrayList;


public class MainCategoryAdapter extends RecyclerView.Adapter<MainCategoryAdapter.ViewHolder> {

    private final ArrayList<CategoryNameModel> categoryNameList;
    Context context;

   public ChooseCategory mCallback;


    public MainCategoryAdapter(Context context, ArrayList<CategoryNameModel> categoryNameList) {
        this.context=context;
        this.categoryNameList = categoryNameList;

        try{
            this.mCallback = (ChooseCategory) context;
        } catch(ClassCastException ex){
            ex.printStackTrace();
        }


    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item_card, parent,false);
        return new ViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

         final CategoryNameModel nosModel=categoryNameList.get(position);

         holder.categoryName.setText(nosModel.getName());

         holder.categoryName.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 context.startActivity(new Intent(context, SubCategoryActivity.class));
                 //  Toast.makeText(context, nosModel.getName(), Toast.LENGTH_SHORT).show();
              //      mCallback.onCategoryClick(context);
             }
         });



    }

    @Override
    public int getItemCount() {
        return categoryNameList.size();
    //    return 10;
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        /////////////////////////

        TextView categoryName;
       
        /////////////////////////

        ViewHolder(@NonNull View view) {
            super(view);

            categoryName = view.findViewById(R.id.categoryName);
           
        }
    }


}
