package com.tsa.ecommerce;


import android.os.Bundle;

import androidx.annotation.Nullable;

import com.tsa.ecommerce.activity.MyBaseActivity;

public class Show extends MyBaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_category_card);
    }
}
