package com.tsa.ecommerce.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SubCategory {


    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("has_products")
    @Expose
    private Integer hasProducts;
    @SerializedName("sub_categories")
    @Expose
    private List<SubCategory_> subCategories = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHasProducts() {
        return hasProducts;
    }

    public void setHasProducts(Integer hasProducts) {
        this.hasProducts = hasProducts;
    }

    public List<SubCategory_> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory_> subCategories) {
        this.subCategories = subCategories;
    }
}
