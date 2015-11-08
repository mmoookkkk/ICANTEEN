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


public class Choosing extends AppCompatActivity {
    public final static String TYPE_CHOSEN = "com.example.phanthilasaengthong.icanteen.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing);
        Intent intent = getIntent();

    }
    public void chooseCategory(View view){
        Button food_butt = (Button)findViewById(R.id.button_food);
        Button dessert_butt = (Button)findViewById(R.id.button_dessert);
        Button bev_butt = (Button)findViewById(R.id.button_beverage);
        Intent intent2 = new Intent(this, NameList.class);
        if(view==food_butt){
            String category_chosen = food_butt.getText().toString();
            intent2.putExtra(TYPE_CHOSEN, category_chosen);
        }else if(view==dessert_butt){
            String category_chosen = dessert_butt.getText().toString();
            intent2.putExtra(TYPE_CHOSEN, category_chosen);
        }else if(view==bev_butt){
            String category_chosen = bev_butt.getText().toString();
            intent2.putExtra(TYPE_CHOSEN, category_chosen);
        }
        startActivity(intent2);
    }

}
