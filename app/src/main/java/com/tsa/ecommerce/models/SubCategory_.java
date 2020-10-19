package com.tsa.ecommerce.models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class SubCategory_ {


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
        private Object subCategories;

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

    public Object getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Object subCategories) {
        this.subCategories = subCategories;
    }
}
