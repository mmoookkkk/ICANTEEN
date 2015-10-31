package com.example.phanthilasaengthong.icanteen;

import android.app.Application;
import android.os.Bundle;

import com.parse.Parse;

/**
 * Created by mink on 10/31/15 AD.
 */
public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "9lctBnLqpPIJAUCGznggPX04qHSUyw9U0ZfNDNHK", "7hZ2TSd3BW21cT5vxipTZlzaVsYIcIYbjF7WucEk");


    }
}
