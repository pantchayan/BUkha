package com.example.pantchayan.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.widget.Toast;


import org.w3c.dom.Text;

import static com.example.pantchayan.myapplication.R.*;
import static com.example.pantchayan.myapplication.R.id.*;

public class Login_screen extends Activity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);


        Password = (EditText) findViewById(R.id.etPassword);
        Info = (TextView) findViewById(R.id.tvInfo);
        Login = (Button) findViewById(R.id.btnLogin);
        Name = (EditText) findViewById(R.id.etName);

        Info.setText("No of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword) {
        if ((userName.equals("CP8963")) && (userPassword.equals("123123"))) {
            Intent intent = new Intent(Login_screen.this, main_page.class);
            startActivity(intent);

            Toast.makeText(Login_screen.this, "Logged in successfully!", Toast.LENGTH_LONG).show();
        } else {
            counter--;

            Info.setText("No of attempts remaining: " + String.valueOf(counter));

            Toast.makeText(Login_screen.this, "Login Failed! Please enter correct values.", Toast.LENGTH_LONG).show();

            if (counter == 0) {
                Login.setEnabled(false);
                Info.setText("Please restart the app");
            }
        }
    }

}



