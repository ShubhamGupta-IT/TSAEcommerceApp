package com.tsa.ecommerce.activity;


import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.tsa.ecommerce.R;

public class ProductDetailActivity extends MyBaseActivity {

    ImageView image;
    TextView name,price,brandName,addToCart,buyNow;
    WebView descriptionWebView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details);

        image=findViewById(R.id.image);
        name=findViewById(R.id.name);
        price=findViewById(R.id.price);
        brandName=findViewById(R.id.brandName);
        descriptionWebView=findViewById(R.id.descriptionWebView);
        addToCart=findViewById(R.id.addToCart);
        buyNow=findViewById(R.id.buyNow);



        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        buyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        showProductDetails("","","","","");
    }

    private void showProductDetails(String image_url, String name, String price, String brand, String details_url) {

        Glide.with(this).load(image_url).into(image);
        this.name.setText(name);
        this.price.setText("Rs. "+price);
        this.brandName.setText(brand);

    }


}
