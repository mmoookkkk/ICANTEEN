package com.example.phanthilasaengthong.icanteen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.parse.Parse;
import com.parse.ParseObject;

public class Review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        Intent intent=getIntent();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "DGvHPpPOc1GMvZ3uortPKJUnUxoB1UvHIEB18tqF", "rGHEIPpLxH9zmqwVoo1RNEilKoiPQjQJwiwt16Kz");
    }
    public void showThankyou(View view){
     ParseObject testObject = new ParseObject("hello");
     testObject.put("foo", "comment2");
        testObject.saveInBackground();
        Intent intent2 = new Intent(this, Thankyou.class);
        startActivity(intent2);

    }

}
