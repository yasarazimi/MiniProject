package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView SignUp, Login, Apply, Home, About, Contacts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SignUp= findViewById(R.id.SignUp);
        Login= findViewById(R.id.Login);
        Apply= findViewById(R.id.Apply);
        Home= findViewById(R.id.Home);
        About= findViewById(R.id.About);
        Contacts= findViewById(R.id.Contacts);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUp();
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });
        Apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openApply();
            }
        });
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAbout();
            }
        });
        Contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openContacts();
            }
        });

    }
    public void openSignUp() {
        Intent intent1 = new Intent(this, Activity2.class);
        startActivity(intent1);

    }
    public void openLogin() {
        Intent intent2 = new Intent(this, Activity3.class);
        startActivity(intent2);

    }
    public void openApply() {
        Intent intent3 = new Intent(this, Activity5.class);
        startActivity(intent3);

    }
    public void openHome() {
        Intent intent4 = new Intent(this, Activity4.class);
        startActivity(intent4);

    }
    public void openAbout() {
        Intent intent5 = new Intent(this, Activity6.class);
        startActivity(intent5);

    }
    public void openContacts() {
        Intent intent6 = new Intent(this, Activity7.class);
        startActivity(intent6);

    }
}