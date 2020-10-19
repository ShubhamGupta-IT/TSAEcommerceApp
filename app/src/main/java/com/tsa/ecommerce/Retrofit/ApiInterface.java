package com.tsa.ecommerce.Retrofit;


import com.tsa.ecommerce.models.CategoryTreeModel;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {

    @GET("o/categoriesample.json?alt=media&token=67569076-be6d-4e6b-9a0d-bd2865517b7e")
    Call<CategoryTreeModel> getCategory();



}