package com.example.phanthilasaengthong.icanteen;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Review extends AppCompatActivity {
    ParseObject testObject;
    String comments;
    String name;
    ArrayAdapter<String> objAdapter;
    ArrayList<String> commentarray=new ArrayList<>();
      String[] arraycomment;
     int size;
    Fragment_comment fragment_comment = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        Intent intent=getIntent();
        name = intent.getStringExtra(Details.RES_NAME);




    }

    public void onResume(){
        super.onResume();


        ParseQuery<ParseObject> query = ParseQuery.getQuery("try");
        query.whereEqualTo("name", name);

        try {
            List<ParseObject> commentList = query.find();
            commentarray.clear();
            size=0;
            for(ParseObject comment:commentList){
                commentarray.add((String)comment.get("comments"));
                Log.d("add", (String) comment.get("comments"));
                size++;
                Log.d("size",""+size);
            }


        } catch( Exception e) {


        }


        arraycomment=new String[size];
        for(int i=0;i<size;i++){
            arraycomment[i]="COMMENT"+(i+1)+" :"+commentarray.get(i);
            Log.d("inArray", arraycomment[i]);
        }

        fragment_comment = new Fragment_comment();
        fragment_comment.setComments(arraycomment);
      //  fragment_comment.getObj().notifyDataSetChanged();
            FragmentTransaction ft = getFragmentManager().beginTransaction();

            ft.add(R.id.fragment_container2, fragment_comment).commit();



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


    public static class Fragment_comment extends Fragment {
       private ListView myListView;
        String[] arrayfromabove = null;
        ArrayAdapter<String> obj2;

        public Fragment_comment() {


        }
        public void setComments(String[] comments){
            arrayfromabove = comments;
        }
        public ArrayAdapter<String> getObj() { return obj2; }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView=inflater.inflate(R.layout.fragment_commentlist,
                    container, false);
            myListView= (ListView)rootView.findViewById(R.id.listcomment);
             obj2=new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_list_item_1,arrayfromabove);
            myListView.setAdapter(obj2);


            return rootView;
        }


    }

}
