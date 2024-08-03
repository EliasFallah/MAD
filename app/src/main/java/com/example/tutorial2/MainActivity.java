package com.example.tutorial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button submit = findViewById(R.id.submitButton);
    submit.setOnClickListener(view -> {
        TextView msg = findViewById(R.id.welcomeMessage);
        EditText userInput = findViewById(R.id.userText);
        String userText = userInput.getText().toString();
        // msg.setText(userText);
        Toast.makeText(MainActivity.this, userText, Toast.LENGTH_LONG).show();
    });


    }


}