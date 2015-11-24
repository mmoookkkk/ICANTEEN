package com.example.phanthilasaengthong.icanteen;

import android.view.View;

/**
 * Created by Tammy on 11/6/15.
 */
import android.os.Handler;
import android.os.Looper;
import android.view.View;


public class DrawingThread {
    private View view = null;
    private int fps;
    private Thread thread = null;
    private Handler handler = null;
    private volatile boolean isRunning = false;


    public DrawingThread(View view, int fps) {
        if (view == null || fps <= 0) {
            throw new IllegalArgumentException();
        }
        this.view = view;
        this.fps = fps;
        this.handler = new Handler(Looper.getMainLooper());
    }


    public boolean isRunning() {
        return thread != null;
    }


    public void start() {
        if (thread == null) {
            thread = new Thread(new MainRunner());
            thread.start();
        }
    }


    public void stop() {
        if (thread != null) {
            isRunning = false;
            try {
                thread.join();
            } catch (InterruptedException ie) {
                // empty
            }
            thread = null;
        }
    }


    private class MainRunner implements Runnable {
        public void run() {
            isRunning = true;
            while (isRunning) {

                try {
                    Thread.sleep(1000 / fps);
                } catch (InterruptedException ie) {
                    isRunning = false;
                }


                handler.post(new Updater());
            }
        }
    }


    private class Updater implements Runnable {
        public void run() {
            view.invalidate();

        }
    }
}
