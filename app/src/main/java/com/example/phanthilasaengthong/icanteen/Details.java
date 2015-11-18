package com.example.phanthilasaengthong.icanteen;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

public class Details extends AppCompatActivity {
    String name;
     int sumStar=0;

    int size;
     double starAvg;
    public final static String RES_NAME = "com.example.phanthilasaengthong.icanteen.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        name = intent.getStringExtra(NameList.RES_CHOSEN);
        //int id = intent.getIntExtra(NameList.RES_ID, 0);
        TextView rn = (TextView) findViewById(R.id.restaurantname);
        rn.setText(name);



    }

    public void toReview(View view) {
        Intent intent2 = new Intent(this, Review.class);
        intent2.putExtra(RES_NAME, name);
        startActivity(intent2);
    }

    public void onResume() {
        super.onResume();
        ParseQuery<ParseObject> query = ParseQuery.getQuery("details");
        query.whereEqualTo("restaurant", name);
        try{
            List<ParseObject> restaurantList=query.find();
            for(ParseObject restaurant:restaurantList){

                TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
                menu_restaurant.setText(restaurant.get("menu").toString());

            }

        }catch(Exception e){
            Log.e("error","error");
        }




        if (name.equals(getResources().getString(R.string.food1))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.kinlen);


        }
        if (name.equals(getResources().getString(R.string.food2))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.som);


        }
        if (name.equals(getResources().getString(R.string.food3))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.rujisri);

        }
        if (name.equals(getResources().getString(R.string.food4))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.orawan);


        }
        if (name.equals(getResources().getString(R.string.food5))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.stickyrice);


        }
        if (name.equals(getResources().getString(R.string.food6))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.rat);


        }
        if (name.equals(getResources().getString(R.string.food7))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.nhuer);


        }
        if (name.equals(getResources().getString(R.string.food8))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.lhong);


        }
        if (name.equals(getResources().getString(R.string.food9))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.chickenrice);


        }
        if (name.equals(getResources().getString(R.string.food10))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.steak);


        }
        if (name.equals(getResources().getString(R.string.food11))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.tarmsung);

        }
        if (name.equals(getResources().getString(R.string.dessert1))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.parabola);


        }
        if (name.equals(getResources().getString(R.string.dessert2))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.tw);



        }
        if (name.equals(getResources().getString(R.string.dessert3))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.wan);


        }

        if (name.equals(getResources().getString(R.string.beverage1))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.lobby);


        }
        if (name.equals(getResources().getString(R.string.beverage2))) {



        }
        if (name.equals(getResources().getString(R.string.beverage3))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.suchada);


        }
        if (name.equals(getResources().getString(R.string.beverage4))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.coffee);


        }


        ParseQuery<ParseObject> query2 = ParseQuery.getQuery("try");
        query.whereEqualTo("name", name);
        try{
            List<ParseObject> ratingList=query2.find();
           sumStar=0;
            size=0;
            for(ParseObject star:ratingList){
                sumStar+=star.getInt("rating");
                size++;
                Log.d("show1",""+star.getInt("rating"));
            }

        }catch(Exception e){
             Log.e("error","error");
        }


        starAvg = sumStar/size;
        RatingBar ratingBar=(RatingBar)findViewById(R.id.ratingBar2);
        ratingBar.setRating((float)starAvg);
        ratingBar.setIsIndicator(true);
    }
}