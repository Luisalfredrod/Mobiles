package com.example.luisa.lab3;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    private Context mycontext;
    private SensorManager sensorManager;
    private Sensor proximitySensor;
    private SensorEventListener proximitySensorListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        proximitySensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);


        proximitySensorListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if(sensorEvent.values[0] < proximitySensor.getMaximumRange()) {
                    // Detected something nearby
                    new AlertDialog.Builder(Activity2.this).setTitle("Proximity Alert").setMessage("Watch out!").setNeutralButton("Close", null).show();
                } else {
                    // Nothing is nearby
                    getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {
            }
        };

        // Register it, specifying the polling interval in microseconds
        sensorManager.registerListener(proximitySensorListener, proximitySensor, SensorManager.SENSOR_DELAY_NORMAL);



    }
    @Override
    public void onPause() {

        // Remove post value event listener
        if (proximitySensorListener != null && sensorManager!=null) {
            sensorManager.unregisterListener(proximitySensorListener);
        }
        super.onPause();
    }

    @Override
    public void onStop() {

        // Remove post value event listener
        if (proximitySensorListener != null && sensorManager!=null) {
            sensorManager.unregisterListener(proximitySensorListener);
        }
        super.onStop();
    }
}
