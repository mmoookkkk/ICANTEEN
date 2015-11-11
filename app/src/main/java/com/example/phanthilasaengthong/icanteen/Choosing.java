package com.example.phanthilasaengthong.icanteen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class Choosing extends AppCompatActivity {
    public final static String TYPE_CHOSEN = "com.example.phanthilasaengthong.icanteen.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing);
        Intent intent = getIntent();

    }
    public void chooseCategory(View view){
        ImageButton food_butt = (ImageButton)findViewById(R.id.button_food);
        ImageButton dessert_butt = (ImageButton)findViewById(R.id.button_dessert);
        ImageButton bev_butt = (ImageButton)findViewById(R.id.button_beverage);
        Intent intent2 = new Intent(this, NameList.class);
        if(view==food_butt){
            String category_chosen = "FOOD";
            intent2.putExtra(TYPE_CHOSEN, category_chosen);
        }else if(view==dessert_butt){
            String category_chosen ="DESSERT";
            intent2.putExtra(TYPE_CHOSEN, category_chosen);
        }else if(view==bev_butt){
            String category_chosen = "BEVERAGE";
            intent2.putExtra(TYPE_CHOSEN, category_chosen);
        }
        startActivity(intent2);
    }

}
