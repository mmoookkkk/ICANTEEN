package com.example.phanthilasaengthong.icanteen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Random extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        Intent intent = getIntent();


    }
    protected void onResume() {
        super.onResume();
        int r=(int) Math.ceil(Math.random()*7);
        if(r==1){

        }



    }
    //on resume na vickyyyyyyy!!! harm luemmm e vicky!!
    //du example in namelist na e vickyyy mai suay



}
