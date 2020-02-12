package com.example.cair;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText firstNameText = findViewById(R.id.firstName);
        final EditText lastNameText = findViewById(R.id.lastName);
        final EditText emailText = findViewById(R.id.email);
        final EditText contactNumberText = findViewById(R.id.contactNumber);

        final String firstName = firstNameText.getText().toString();
        final String lastName = lastNameText.getText().toString();
        final String email = emailText.getText().toString();
        final String contactNumber = contactNumberText.getText().toString();
    }
}
