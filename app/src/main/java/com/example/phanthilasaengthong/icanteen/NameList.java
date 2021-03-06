package com.example.phanthilasaengthong.icanteen;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
//import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class NameList extends AppCompatActivity {
    public final static String RES_CHOSEN = "com.example.phanthilasaengthong.icanteen.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_list);
        Intent intent = getIntent();
        String type = intent.getStringExtra(Choosing.TYPE_CHOSEN);
        TextView type_title = (TextView) findViewById(R.id.type_title);
        type_title.setText(type);


        if (type.equals(getResources().getString(R.string.FOOD))) {
            Fragment_food fragment1 = new Fragment_food();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.add(R.id.fragment_container, fragment1).commit();


        } else if (type.equals(getResources().getString(R.string.DESSERT))) {
            Fragment_dessert fragment1 = new Fragment_dessert();

            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.add(R.id.fragment_container, fragment1).commit();

        } else {
            Fragment_bev fragment1 = new Fragment_bev();

            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.add(R.id.fragment_container, fragment1).commit();

        }




    }
    public void chooseFood(View view) {
        Intent intent1=new Intent(this,Details.class);
        Button bc=(Button) view;

        String name_res=bc.getText().toString();
        intent1.putExtra(RES_CHOSEN, name_res);

        startActivity(intent1);




    }

    protected void onResume() {
        super.onResume();


    }

    public static class Fragment_bev extends Fragment {

        public Fragment_bev() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            return inflater.inflate(R.layout.fragment_beveragelist,
                    container, false);
        }


    }

    public static class Fragment_food extends Fragment {

        public Fragment_food() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            return inflater.inflate(R.layout.fragment_foodlist,
                    container, false);
        }


    }

        public static class Fragment_dessert extends Fragment {

            public Fragment_dessert() {
            }

            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState) {

                return inflater.inflate(R.layout.fragment_dessertlist,
                        container, false);
            }


        }

}


