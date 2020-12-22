package com.example.h2o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class CustomerServiceActivity extends AppCompatActivity {

    //initialize variable
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_service);
        //assign variable
        drawerLayout = findViewById(R.id.drawer_layout);
    }
    public void ClickMenu(View view){
        //open drawer
        ProductListActivity.openDrawer(drawerLayout);
    }
    public void ClickLogo(View view){
        //close Drawer
        ProductListActivity.closeDrawer(drawerLayout);
    }
    public void ClickHome(View view){
        ProductListActivity.redirectActivity(this, ProductListActivity.class);
    }
    public void  ClickMyAccount(View view){
       ProductListActivity.redirectActivity(this,MyAccountActivity.class);
    }
    public void ClickMyCart(View view){
        ProductListActivity.redirectActivity(this, MyCartActivity.class);
    }
    public void ClickMyOrder(View view){
        ProductListActivity.redirectActivity(this, MyOrderActivity.class);
    }
    public void ClickCustomerService(View view){
       recreate();
    }
    public void ClickFaq(View view){
        ProductListActivity.redirectActivity(this,FaqActivity.class);
    }
}