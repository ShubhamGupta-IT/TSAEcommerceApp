package com.tsa.ecommerce.activity;


import android.os.Bundle;

import androidx.annotation.Nullable;

import com.tsa.ecommerce.R;

public class MyAccount extends MyBaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage_address);
    }
}
