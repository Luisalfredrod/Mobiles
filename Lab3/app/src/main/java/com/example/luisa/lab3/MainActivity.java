package com.example.luisa.lab3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button butprox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butprox = (Button) findViewById(R.id.butProximity);



        Button vibButton =(Button)findViewById(R.id.butVibrate);
        vibButton.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                //Set the pattern for vibration
                long pattern[]={0,200,100,400,400}; // or you can just set a duration also in ms
                Vibrator vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(pattern, -1);
                Toast.makeText(MainActivity.this, "Vibrating", Toast.LENGTH_LONG).show();


            }
        });

        butprox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentprox = new Intent(MainActivity.this, Activity2.class);
                startActivity(intentprox);
            }
        });
    }
}
