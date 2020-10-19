package com.tsa.ecommerce.models;

import java.util.ArrayList;

public class SubCategoryModel {

    int id;
    String name;
    String has_products;
    ArrayList sub_categories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHas_products() {
        return has_products;
    }

    public void setHas_products(String has_products) {
        this.has_products = has_products;
    }

    public ArrayList getSub_categories() {
        return sub_categories;
    }

    public void setSub_categories(ArrayList sub_categories) {
        this.sub_categories = sub_categories;
    }
}
