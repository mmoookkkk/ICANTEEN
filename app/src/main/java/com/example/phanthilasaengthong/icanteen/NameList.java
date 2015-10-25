package com.example.phanthilasaengthong.icanteen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class NameList extends AppCompatActivity {
 String[] food={"R.string.food1","R.string.food2","R.string.food3","R.string.food4","R.string.food5","R.string.food6","R.string.food7","R.string.food8","R.string.food9","R.string.food10","R.string.food11"};
    String[] dessert={"R.string.dessert1","R.string.dessert2","R.string.dessert3","R.string.dessert4"};
    String[] beverage={"R.string.beverage1","R.string.beverage2","R.string.beverage3","R.string.beverage4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_list);

    }

}
