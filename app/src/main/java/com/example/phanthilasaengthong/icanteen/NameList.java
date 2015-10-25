package com.example.phanthilasaengthong.icanteen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class NameList extends AppCompatActivity {
 String[] food={"R.string.food1","R.string.food2","R.string.food3","R.string.food4","R.string.food5","R.string.food6","R.string.food7","R.string.food8","R.string.food9"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_list);

    }

}
