package com.example.h2o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProductListActivity extends AppCompatActivity {

    //initialize variable
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        //assign variable
        drawerLayout = findViewById(R.id.drawer_layout);
    }
    public void ClickMenu(View view){
        // open Drawer
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        //open drawer layout
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public void ClickLogo(View view){
        closeDrawer(drawerLayout);
    }

    public static void closeDrawer(DrawerLayout drawerLayout) {
        // close Drawer
        //check if drawer is open
        try {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                //when drawer is open
                //close drawer
                drawerLayout.closeDrawer(GravityCompat.START);
            }
        }
        catch (IllegalStateException e){

        }
    }
    public void ClickHome(View view){
        //recraete activity
        recreate();
    }
    public void ClickMyAccount(View view){
        //redirect activity to myaccount
        redirectActivity(this, MyAccountActivity.class);
    }
    public void ClickMyCart(View view){
        //redirect activity to mycart
        redirectActivity(this, MyCartActivity.class);
    }
    public void ClickMyOrder(View view){
        //redirect to click my order
        redirectActivity(this, MyOrderActivity.class);
    }
    public void ClickCustomerService(View view){
        //redirect to customer service
        redirectActivity(this, CustomerServiceActivity.class);
    }
    public void ClickFaq(View view){
        //redirect to faq
        redirectActivity(this, FaqActivity.class);
    }

    public static void redirectActivity(Activity activity, Class aClass) {
        //initialze intent
        Intent intent = new Intent(activity, aClass);
        //set flag
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //start activity
        activity.startActivity(intent);

    }

    @Override
    protected void onPause() {
        super.onPause();
        //close drawer
        closeDrawer(drawerLayout);
    }
}