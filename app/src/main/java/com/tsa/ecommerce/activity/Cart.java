package com.tsa.ecommerce.activity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tsa.ecommerce.R;
import com.tsa.ecommerce.interfaces.UpdateFinalAmount;

public class Cart extends MyBaseActivity implements UpdateFinalAmount {

    Button placeOrder;
    TextView finalAmount;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);

        placeOrder=findViewById(R.id.placeOrder);
        finalAmount=findViewById(R.id.finalAmount);

        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Cart.this,BookOrder.class));


            }
        });
    }

    @Override
    public void onPriceChange( int amount) {
        finalAmount.setText("Rs. "+amount);
    }
}
