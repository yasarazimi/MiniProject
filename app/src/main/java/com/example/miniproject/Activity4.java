package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Activity4 extends AppCompatActivity {
    LinearLayout office, cyber, ethical, mobile, web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);


        office= findViewById(R.id.office);
        cyber= findViewById(R.id.cyber);
        ethical= findViewById(R.id.ethical);
        mobile= findViewById(R.id.mobile);
        web= findViewById(R.id.web);

        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openoffice();
            }
        });
        cyber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencyber();
            }
        });
        ethical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openethical();
            }
        });
        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmobile();
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });
    }
    public void openoffice() {
        Intent intent15 = new Intent(this, Activity5.class);
        startActivity(intent15);

    }
    public void opencyber() {
        Intent intent16 = new Intent(this, Activity5.class);
        startActivity(intent16);

    }
    public void openethical() {
        Intent intent17 = new Intent(this, Activity5.class);
        startActivity(intent17);

    }
    public void openmobile() {
        Intent intent18 = new Intent(this, Activity5.class);
        startActivity(intent18);

    }
    public void openweb() {
        Intent intent19 = new Intent(this, Activity5.class);
        startActivity(intent19);

    }

}