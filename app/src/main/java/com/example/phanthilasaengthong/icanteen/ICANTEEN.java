package com.example.phanthilasaengthong.icanteen;

import android.app.Application;
import android.os.Bundle;

import com.parse.Parse;

/**
 * Created by phanthilasaengthong on 11/10/15 AD.
 */
public class ICANTEEN extends Application {
    public void onCreate() {
        super.onCreate();
      Parse.enableLocalDatastore(this);
      Parse.initialize(this, "DGvHPpPOc1GMvZ3uortPKJUnUxoB1UvHIEB18tqF", "rGHEIPpLxH9zmqwVoo1RNEilKoiPQjQJwiwt16Kz");

    }
}
