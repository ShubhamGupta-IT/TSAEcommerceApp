package com.tsa.ecommerce.repository;

import android.content.Context;
import android.widget.Toast;

import com.tsa.ecommerce.Retrofit.ApiClient;
import com.tsa.ecommerce.Retrofit.ApiInterface;
import com.tsa.ecommerce.models.CategoryTreeModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ViewCategory {

    ArrayList arrayList = new ArrayList();
    ArrayList<CategoryTreeModel> subCategoryModelsList=new ArrayList<>();
    Context context;

    public ViewCategory(Context context) {
        this.context = context;
        getCategoryList(context);
    }

    private void getCategoryList(final Context context){


        ApiInterface apiClient = ApiClient.getClient().create(ApiInterface.class);
        Call<CategoryTreeModel> call = apiClient.getCategory();
        call.enqueue(new Callback<CategoryTreeModel>() {
            @Override
            public void onResponse(Call<CategoryTreeModel> call, Response<CategoryTreeModel> response) {

                subCategoryModelsList.add(response.body());


           //     subCategoryModels=(SubCategoryModel)responseBody;
            }

            @Override
            public void onFailure(Call<CategoryTreeModel> call, Throwable t) {

                Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show();

            }
        });


    }


}
