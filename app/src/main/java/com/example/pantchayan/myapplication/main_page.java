package com.example.pantchayan.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class main_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void about_us ( android.view.View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cp8963.wixsite.com/about"));
        startActivity(browserIntent);
    }
    public void store(android.view.View view){
        Intent intent = new Intent(main_page.this,tuck_shop.class);
        startActivity(intent);
    }
    public void bmi (android.view.View view){
        Intent intent = new Intent(main_page.this,bmi.class);
        startActivity(intent);
    }
    public void snack(android.view.View view){
        Intent intent = new Intent(main_page.this,snack_counters.class);
        startActivity(intent);
    }
    public void mess_menu(android.view.View view) {
        Intent intent = new Intent(main_page.this, mess.class);
        startActivity(intent);
    }

}
