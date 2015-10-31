package com.example.phanthilasaengthong.icanteen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

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
            TextView menu_random = (TextView) findViewById(R.id.menu_random);
            menu_random.setText("ข้าวเหนียวไก่ทอด");
            TextView res_random = (TextView) findViewById(R.id.random_shop);
            res_random.setText(getResources().getText(R.string.food5));

        }

        if(r==2){
            TextView menu_random = (TextView) findViewById(R.id.menu_random);
            menu_random.setText("ข้าวไก่แซ่บ");
            TextView res_random = (TextView) findViewById(R.id.random_shop);
            res_random.setText(getResources().getText(R.string.food6));

        }

        if(r==3){
            TextView menu_random = (TextView) findViewById(R.id.menu_random);
            menu_random.setText("ไข่กระทะ");
            TextView res_random = (TextView) findViewById(R.id.random_shop);
            res_random.setText(getResources().getText(R.string.food2));

        }

        if(r==4){
            TextView menu_random = (TextView) findViewById(R.id.menu_random);
            menu_random.setText("ก๋วยเตี๋ยวต้มยำ");
            TextView res_random = (TextView) findViewById(R.id.random_shop);
            res_random.setText(getResources().getText(R.string.food3));

        }

        if(r==5){
            TextView menu_random = (TextView) findViewById(R.id.menu_random);
            menu_random.setText("ข้าวไก่กระเพรา");
            TextView res_random = (TextView) findViewById(R.id.random_shop);
            res_random.setText(getResources().getText(R.string.food6));

        }

        if(r==6){
            TextView menu_random = (TextView) findViewById(R.id.menu_random);
            menu_random.setText("หมูมะนาว");
            TextView res_random = (TextView) findViewById(R.id.random_shop);
            res_random.setText(getResources().getText(R.string.food3));

        }

        if(r==7){
            TextView menu_random = (TextView) findViewById(R.id.menu_random);
            menu_random.setText("parabola");
            TextView res_random = (TextView) findViewById(R.id.random_shop);
            res_random.setText(getResources().getText(R.string.dessert1));

        }




    }
    //on resume na vickyyyyyyy!!! harm luemmm e vicky!!
    //du example in namelist na e vickyyy suay



}
