package com.example.phanthilasaengthong.icanteen;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.app.AlertDialog;



public class MainActivity extends AppCompatActivity {
    AlertDialog alertdialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent= getIntent();
        setContentView(R.layout.activity_main);
        alertdialog=new AlertDialog.Builder(this).create();
        alertdialog.setTitle("WARNING!!");
        alertdialog.setMessage("This application requires INTERNET CONNECTION!");
        alertdialog.setButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

    }

    public void clickChoose(View view) {
        // Do something in response to button//
        if(isNetworkAvailable()) {
            Intent intent = new Intent(this, Choosing.class);
            startActivity(intent);
        }else{
            alertdialog.show();

        }
    }
    public void clickRandom(View view){
        if(isNetworkAvailable()) {
            Intent intent2 = new Intent(this, Random.class);
            startActivity(intent2);
        }else{
            alertdialog.show();

        }
    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


}
