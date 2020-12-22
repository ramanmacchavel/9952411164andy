package com.example.h2o;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.Instant;

public class RegisterUserActivity extends AppCompatActivity {

    Button BtnAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        BtnAddress = (Button) findViewById(R.id.btn_address);
        BtnAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenProductList();
            }
        });

    }
    public void OpenProductList(){
        Intent ProductIntent = new Intent(this, ProductListActivity.class);
        startActivity(ProductIntent);
    }

}