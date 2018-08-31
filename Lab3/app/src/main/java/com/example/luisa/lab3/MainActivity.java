package com.example.luisa.lab3;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butVibrate =(Button)findViewById(R.id.butVibrate);
        butVibrate.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                long pattern[]={0,200,100,300,400};
                Vibrator vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(pattern, -1);


            }
    }
}
