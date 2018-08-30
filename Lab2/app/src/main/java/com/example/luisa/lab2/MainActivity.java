package com.example.luisa.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    TextView header;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        header = findViewById(R.id.header);
        name = findViewById(R.id.name);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendExtra = new Intent(MainActivity.this, Activity2.class);
                sendExtra.putExtra("name", name.getText().toString());
                startActivity(sendExtra);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent orientation = new Intent(MainActivity.this, Activity3.class);
                startActivity(orientation);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                header.setText("Hello!");
            }
        });
    }
}