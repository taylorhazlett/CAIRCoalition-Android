package com.example.cair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button registerBtn = findViewById(R.id.register_btn);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(getApplicationContext(), Register.class);
                // registerIntent.putExtra("key", value); //Optional parameters
                startActivity(registerIntent);
            }
        });

        final Button loginBtn = findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent loginIntent = new Intent(getApplicationContext(), Login.class);
                // loginIntent.putExtra("key", value); //Optional parameters
                startActivity(loginIntent);
            }
        });
    }
}
