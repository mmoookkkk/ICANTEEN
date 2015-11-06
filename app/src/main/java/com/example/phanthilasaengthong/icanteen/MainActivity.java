package com.example.phanthilasaengthong.icanteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.parse.Parse;
import com.parse.ParseObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "DGvHPpPOc1GMvZ3uortPKJUnUxoB1UvHIEB18tqF", "rGHEIPpLxH9zmqwVoo1RNEilKoiPQjQJwiwt16Kz");

       ParseObject testObject = new ParseObject("hello");
       testObject.put("foo", "bar");
        testObject.saveInBackground();
        //addchange!!
    }
    public void clickChoose(View view) {
        // Do something in response to button//
        Intent intent = new Intent(this, Choosing.class);
        startActivity(intent);
    }
    public void clickRandom(View view){
        Intent intent2= new Intent(this, Random.class);
        startActivity(intent2);
    }

}
