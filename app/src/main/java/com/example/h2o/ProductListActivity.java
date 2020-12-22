package com.example.h2o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ProductListActivity extends AppCompatActivity {

    //initialize variable
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(){
       openDrawer(drawerLayout);
    }

    private static void openDrawer(DrawerLayout drawerLayout) {
        //open drawer layout
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public void clickLogo(){
        closeDrawer(drawerLayout);
    }

    private static void closeDrawer(DrawerLayout drawerLayout) {
        //close drawer layout

        //check condition
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            //when drawer is open
            //close drawer
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
    public void ClickHome(View view){
        recreate();
    }
    public void ClickMyAccount(View view){
        redirectActivity();
    }

    private static void redirectActivity(Activity activity, Class aclass) {

    }
    public void ClickMyCart(){
        redirectActivity();
    }
    public void MyOrder(){
        redirectActivity();
    }
    public void ClickCustomeCare(){
        redirectActivity();
    }
    public void ClickFaq(){
        redirectActivity();
    }
}