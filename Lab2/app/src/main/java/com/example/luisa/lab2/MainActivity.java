package com.example.luisa.lab2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonA1 = findViewById(R.id.button1);
        buttonA2 = findViewById(R.id.button2);
        buttonA3 = findViewById(R.id.button3);


        buttonA1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                myString = editTextMgr.getText().toString();
                Intent intentC1 = new Intent(packageContext: MainActivity.this, Main);
                intentC1.putExtra(name: "theString", myString);
                startActivity(intentC1);
            }
        });

        buttonMgr2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intentC2 = new Intent(packageContext: MainActivity2.this, Main);
                startActivity(intentC2);
            }
        });
    }


}
