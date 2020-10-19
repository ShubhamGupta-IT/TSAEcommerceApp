package com.tsa.ecommerce.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import com.tsa.ecommerce.R;

public class SigninSignUp {
    Context context;

    public SigninSignUp(Context context) {
        this.context = context;

        ShowLoginOption();
    }

    public void ShowLoginOption() {
        LayoutInflater factory = LayoutInflater.from(context);

        // Create an alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Sign In");
        final View customLayout = factory.inflate(R.layout.signin_signup,null);
        builder.setView(customLayout);

        Button sendOtp=customLayout.findViewById(R.id.sendOtp);
        sendOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "send Otp", Toast.LENGTH_SHORT).show();
            }
        });


        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
