package com.example.h2o;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.function.LongToIntFunction;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openregisteractivity();
            }
        });
    }

    public void openregisteractivity(){

         TextView ErrorLabel = (TextView) findViewById(R.id.l_error);
        try {
                TextView MobileNumber = (TextView) findViewById(R.id.txt_mobile);
                Intent regintent = new Intent(this, OtpVerificationActivity.class);
                Long MobileNum = Long.valueOf(MobileNumber.getText().toString());
               // int Moblenth = MobileNum.length();

                // if mobile number starts with 0
                if (MobileNum < 1000000000 ) {
                   // Toast.makeText(MainActivity.this, "Enter Valid Mobile Number", Toast.LENGTH_SHORT).show();
                    ErrorLabel.setText("Enter Valid Mobile Number");
                } else {

                    startActivity(regintent);
                }
             }
        catch (Exception e){
            ErrorLabel.setText("Enter Valid Mobile Number");
        }
    }
}