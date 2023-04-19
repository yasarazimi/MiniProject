package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity5 extends AppCompatActivity {
    TextView Subject, ContactNum, Password, Email, Name;
    EditText Subject1, Contacts1, Password1, Email1, Name1;
    ImageView imageView1;
    Button Apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        Name= findViewById(R.id.Name1);
        Subject= findViewById(R.id.Subject1);
        ContactNum= findViewById(R.id.Contacts1);
        Password= findViewById(R.id.Password1);
        Email= findViewById(R.id.Email1);
        Apply= findViewById(R.id.Apply);

        Name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openName();
            }
        });
        Subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSubject();
            }
        });
        ContactNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openContactNum();
            }
        });
        Password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPassword();
            }
        });
        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEmail();
            }
        });
        Apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openApply();
            }
        });
    }
    public void openName() {

    }
    public void openSubject() {

    }
    public void openContactNum() {

    }
    public void openPassword() {

    }
    public void openEmail() {

    }
    public void openApply() {
        Toast.makeText(getApplicationContext(), "Your Data has been Saved", Toast.LENGTH_SHORT).show();
        Intent intent20 = new Intent(this, MainActivity.class);
        startActivity(intent20);

    }

}