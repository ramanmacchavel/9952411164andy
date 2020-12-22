package com.example.h2o;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OtpVerificationActivity extends AppCompatActivity {

    TextView txtotp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        //variable declaration
        Button BtnVerify = (Button) findViewById(R.id.btn_verify);
        BtnVerify.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                OpenRegActivity();
            }
        });
    }
    public void OpenRegActivity(){

        txtotp = (TextView) findViewById(R.id.txt_otp);
        try {
            // int Txtotp = Integer.parseInt(txtotp.getText().toString());
            if (!txtotp.getText().equals("")) {
                int Txtotp = Integer.parseInt(txtotp.getText().toString());
                Intent RegActIntent = new Intent(this, RegisterUserActivity.class);
                startActivity(RegActIntent);
            }
        }catch (Exception ex){
            Toast.makeText(OtpVerificationActivity.this, " Enter Your OTP", Toast.LENGTH_SHORT).show();
        }

       //Intent RegActIntent = new Intent(this, RegisterUserActivity.class);
      // startActivity(RegActIntent);

    }

}