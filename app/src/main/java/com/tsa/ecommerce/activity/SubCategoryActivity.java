package com.tsa.ecommerce.activity;


import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tsa.ecommerce.R;
import com.tsa.ecommerce.adapters.SubCategoryAdapter;
import com.tsa.ecommerce.interfaces.ChooseCategory;
import com.tsa.ecommerce.models.CategoryNameModel;
import com.tsa.ecommerce.repository.ViewCategory;

import java.util.ArrayList;

public class SubCategoryActivity extends MyBaseActivity implements ChooseCategory {

    RecyclerView subCategoryRecycler;
    ArrayList<CategoryNameModel> subCategoryList;


    
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_category_activity);

        subCategoryRecycler=findViewById(R.id.subCategoryRecycler);

        LinearLayoutManager layoutManager = new GridLayoutManager(this,3);
        subCategoryRecycler.setLayoutManager(layoutManager);


        new ViewCategory(this);


        showCategory(subCategoryList);

    }

    public void showCategory(ArrayList<CategoryNameModel> arrayList){

        subCategoryList=new ArrayList<>();
        SubCategoryAdapter  subCategoryAdapter = new SubCategoryAdapter(this, arrayList);
        subCategoryRecycler.setAdapter(subCategoryAdapter);
    }

    @Override
    public void onSubCategoryClick(Context context) {

        Toast.makeText(context, "Sub Category", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onViewProductsClick(Context context, int position) {

        Toast.makeText(context, "Position "+position, Toast.LENGTH_SHORT).show();
    }
}
