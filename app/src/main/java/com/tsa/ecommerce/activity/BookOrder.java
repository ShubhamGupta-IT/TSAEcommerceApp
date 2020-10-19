package com.tsa.ecommerce.activity;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.tsa.ecommerce.R;

public class BookOrder extends MyBaseActivity {

    Button bookOrder;
    Context context;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_order);
        context=BookOrder.this;
        bookOrder=findViewById(R.id.bookOrder);

        bookOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (true){
                    new SigninSignUp(context);
                }
                else {
                    Toast.makeText(context, "Order Booked", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
