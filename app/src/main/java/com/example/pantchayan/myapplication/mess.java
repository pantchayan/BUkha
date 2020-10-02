package com.example.pantchayan.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class mess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mess);
    }
    public void messmenu ( android.view.View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1wIy6wy1GMAhn4SJRV2TWIin8KHTLnDIw/view?usp=sharing"));
        startActivity(browserIntent);
    }
}
