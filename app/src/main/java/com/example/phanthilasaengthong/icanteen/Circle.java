package com.example.phanthilasaengthong.icanteen;

import android.content.Context;
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

    int radius = 50;

    List<Integer> posX = new ArrayList<Integer>();
    List<Integer> posY = new ArrayList<Integer>();
    List<Integer> count2 = new ArrayList<Integer>();

    public void random(int w, int h) {
        Random r = new Random();
        x = r.nextInt(w - (2 * radius)) + radius;
        y = r.nextInt(h - (2 * radius)) + radius;

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
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.rgb(195,255,255));
        for(int j=0; j<count2.size();j++){
            if(count2.get(j)>5){
                count2.remove(j);
                posX.remove(j);
                posY.remove(j);
            }

        }
        for (int i = 0; i < posX.size(); i++) {
            c.drawCircle(posX.get(i), posY.get(i), radius, paint);
            System.out.print(i);
            count2.set(i, count2.get(i) + 1);

        }
    }










}