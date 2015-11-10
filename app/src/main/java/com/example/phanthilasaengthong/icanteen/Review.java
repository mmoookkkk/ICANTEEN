package com.example.phanthilasaengthong.icanteen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

public class Review extends AppCompatActivity {
    ParseObject testObject;
    String comments;
    String name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        Intent intent=getIntent();
        name = intent.getStringExtra(Details.RES_NAME);




    }
    public void onResume(){
        super.onResume();


        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "DGvHPpPOc1GMvZ3uortPKJUnUxoB1UvHIEB18tqF", "rGHEIPpLxH9zmqwVoo1RNEilKoiPQjQJwiwt16Kz");


        //TextView commentbefore=(TextView)findViewById(R.id.previouscomments);

        ParseQuery<ParseObject> query = ParseQuery.getQuery("try");
        query.whereEqualTo("name", name);
        query.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> commentList, ParseException e) {
                if (e == null) {
                    for (ParseObject comment : commentList) {
                        Log.d("comments", (String) comment.get("comments"));
                    }
                } else {
                    Log.d("comments", "Error: " + e.getMessage());
                }
            }

        });
    }
    public void showThankyou(View view){
        EditText commentplace=(EditText)findViewById(R.id.edit_message);
        comments=commentplace.getText().toString();
        RatingBar ratingBar=(RatingBar)findViewById(R.id.ratingBarInput);
        float rate=ratingBar.getRating();
        testObject = new ParseObject("try");
        testObject.put("name", name);
        testObject.put("comments",comments);
        testObject.put("rating",rate);
        testObject.saveInBackground();
        Intent intent2 = new Intent(this, Thankyou.class);
        startActivity(intent2);

    }

}
