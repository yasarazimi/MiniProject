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

public class Activity2 extends AppCompatActivity {
    TextView Name, FName, Email, Password, Phone;
    EditText Name1, FName1, Email1, Password1, Phone1;
    Button buttonS, buttonL;
    dbHelp ourdb = new dbHelp(Activity2.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        Name = findViewById(R.id.Name1);
        FName = findViewById(R.id.FName1);
        Email = findViewById(R.id.Email1);
        Password = findViewById(R.id.Password1);
        Phone = findViewById(R.id.Phone1);
        buttonS = findViewById(R.id.buttonS);
        buttonL = findViewById(R.id.buttonL);

        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long res = ourdb.addData(Name.getText().toString().trim(),
                        FName.getText().toString().trim(),
                        Email.getText().toString().trim(),
                        Password.getText().toString().trim(),
                        Phone.getText().toString().trim());

                if (res < 0){
                    Toast.makeText(getApplicationContext(), "Failed To Insert Data", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Your Data Has Been Saved Successfully ", Toast.LENGTH_SHORT).show();
                }

            }
        });

        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });


    }

    public void openLogin() {
        Intent intent12 = new Intent(this, Activity3.class);
        startActivity(intent12);

    }
}