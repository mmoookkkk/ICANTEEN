package com.example.phanthilasaengthong.icanteen;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
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
import android.widget.ListView;
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
    static ArrayList<String> commentarray=new ArrayList<>();
    static String[] arraycomment;
    static int size;



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
        query.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> commentList, ParseException e) {
                if (e == null) {
                    for (ParseObject comment : commentList) {
                        Log.d("comments", (String) comment.get("comments"));

                        commentarray.add((String) comment.get("comments"));
                    }
                } else {
                    Log.d("comments", "Error: " + e.getMessage());
                }
            }

        });
        size=commentarray.size();
        arraycomment=new String[size];
        for(int i=0;i<size;i++){
            arraycomment[i]="COMMENT"+(i+1)+" :"+commentarray.get(i);
            Log.d("show", commentarray.get(i));
        }
        Fragment_comment fragment_comment = new Fragment_comment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.fragment_container2, fragment_comment).commit();
        commentarray.clear();

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
        public Fragment_comment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView=inflater.inflate(R.layout.fragment_commentlist,
                    container, false);
            myListView= (ListView)rootView.findViewById(R.id.listcomment);
            ArrayAdapter<String> objAdapter=new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_list_item_1,arraycomment);
            myListView.setAdapter(objAdapter);


            return rootView;
        }


    }

}
