package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    TextView Name, Email, Password;

    EditText Name1, Email1, Password1;

    Button buttonLl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Name1 = findViewById(R.id.Name1);
        Email1 = findViewById(R.id.Email1);
        Password1 = findViewById(R.id.Password1);
        buttonLl = findViewById(R.id.buttonLl);


        Name1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Email1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Password1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();

            }
        });

    }
    public void openHome() {
        Toast.makeText(getApplicationContext(), "Welcome to Home page", Toast.LENGTH_SHORT).show();
        Intent intent13 = new Intent(this, Activity4.class);
        startActivity(intent13);

    }

}
