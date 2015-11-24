package com.example.phanthilasaengthong.icanteen;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Vibrator;

import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

public class Random extends AppCompatActivity {
   int r=1;
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private ShakeDetector mShakeDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        Intent intent = getIntent();

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager
                .getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mShakeDetector = new ShakeDetector();
        mShakeDetector.setOnShakeListener(new ShakeDetector.OnShakeListener() {

            @Override
            public void onShake(int count) {

                handleShakeEvent(count);
            }
        });




    }

    private void handleShakeEvent(int count) {
        r=(int) Math.ceil(Math.random()*7);
        doRandom(r);

    }

    protected void onResume() {
        super.onResume();
       r=(int) Math.ceil(Math.random()*7);
    doRandom(r);

        mSensorManager.registerListener(mShakeDetector, mAccelerometer, SensorManager.SENSOR_DELAY_UI);

    }
    public void onPause() {

        mSensorManager.unregisterListener(mShakeDetector);
        super.onPause();
    }

    public void newRandom(View view) {
     r = (int) Math.ceil(Math.random() * 7);
        doRandom(r);

    }
    public void doRandom(int r){
        ParseQuery<ParseObject> query = ParseQuery.getQuery("randominfo");
        query.whereEqualTo("R", r);
        try{
            List<ParseObject> randomList=query.find();
            for(ParseObject random:randomList){
                TextView menu_random = (TextView) findViewById(R.id.menu_random);
                menu_random.setText(random.get("rmenu").toString());
                TextView res_random = (TextView) findViewById(R.id.random_shop);
                res_random.setText(random.get("rrestaurant").toString());

            }

        }catch(Exception e){
            Log.e("error","error");
        }
        if (r == 1) {

            ImageView image_random = (ImageView) findViewById(R.id.image_random);
            image_random.setImageResource(R.drawable.random1);

        }

        if (r == 2) {

            ImageView image_random = (ImageView) findViewById(R.id.image_random);
            image_random.setImageResource(R.drawable.random2);

        }

        if (r == 3) {

            ImageView image_random = (ImageView) findViewById(R.id.image_random);
            image_random.setImageResource(R.drawable.random3);

        }

        if (r == 4) {

            ImageView image_random = (ImageView) findViewById(R.id.image_random);
            image_random.setImageResource(R.drawable.random7);

        }

        if (r == 5) {

            ImageView image_random = (ImageView) findViewById(R.id.image_random);
            image_random.setImageResource(R.drawable.random4);

        }

        if (r == 6) {

            ImageView image_random = (ImageView) findViewById(R.id.image_random);
            image_random.setImageResource(R.drawable.random5);

        }

        if (r == 7) {

            ImageView image_random = (ImageView) findViewById(R.id.image_random);
            image_random.setImageResource(R.drawable.random6);


        }
        Vibrator v = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(500);
    }

}
