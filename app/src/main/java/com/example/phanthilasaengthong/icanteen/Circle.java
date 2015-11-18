package com.example.phanthilasaengthong.icanteen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/**
 * Created by Tammy on 11/4/15.
 */
public class Circle extends View {

    public static int x, y;

    private DrawingThread dthread;

    private Context mContext;
    private Handler h;
    int count = 0;

    int radius = 72;

    List<Integer> posX = new ArrayList<>();
    List<Integer> posY = new ArrayList<>();
    List<Integer> count2 = new ArrayList<>();

    public void random(int w, int h) {
        Random r = new Random();
        x = r.nextInt(w - (2 * radius)) ;
        y = r.nextInt(h - (2 * radius)) ;

    }


    public Circle(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        h = new Handler() {
            @Override
            public void close() {

            }

            @Override
            public void flush() {

            }

            @Override
            public void publish(LogRecord record) {

            }
        };
        dthread = new DrawingThread(this, 10);
        dthread.start();
        //d
    }

    public void onDraw(Canvas c) {
        super.onDraw(c);
        int a = c.getWidth();
        int b = c.getHeight();
        random(a, b);
        if (count == 0) {
            posX.add(x);
            posY.add(y);
            count2.add(0);
        }
        count = (count + 1) % 10;

        for(int j=0; j<count2.size();j++){
            if(count2.get(j)>5){
                count2.remove(j);
                posX.remove(j);
                posY.remove(j);
            }

        }
        for (int i = 0; i < posX.size(); i++) {
            Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.spoon);
            c.drawBitmap(bmp,posX.get(i),posY.get(i),null);
            System.out.print(i);
            count2.set(i, count2.get(i) + 1);

        }
    }










}