package com.example.phanthilasaengthong.icanteen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    String name;
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


        if (name.equals(getResources().getString(R.string.food1))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.kinlen);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("ไส้กรอกมินิพันแฮม\nชีสบอล\nไก่ไม่มีกระดูก");

        }
        if (name.equals(getResources().getString(R.string.food2)) ){
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.som);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("ไข่กระทะ\nข้าวทงคัตสีหมูทอด\nแกงกะหรี่ญี่ปุ่น");

        }if (name.equals(getResources().getString(R.string.food3))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.rujisri);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("ก๋วยเตี๋ยวต้มยำทรงเครื่อง\nข้าวอัญชัญกับยำปลาสด\nเกาเหลาเลือดหมู");

        }if (name.equals(getResources().getString(R.string.food4))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.orawan);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("สุกี้แห้ง\nกระเพราไก่ทอด\nข้าวผัดอเมริกัน");

        }if (name.equals(getResources().getString(R.string.food5))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.stickyrice);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("ข้าวเหนียวไก่ทอด\nมาม่าน้ำตกหม\nส้มตำไฮโซ");

        }if (name.equals(getResources().getString(R.string.food6))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.rat);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("ข้าวห่อไข่ไก่ทอด\nสปาเกตตีี้ซอสไก่\nข้าวไข่ระเบิด");

        }if (name.equals(getResources().getString(R.string.food7))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.nhuer);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("โจ๊กหมู\nก๋วยเตี๋ยวหมูน้ำตก\nก๋วยเตี๋ยวเครื่องใน");

        }if (name.equals(getResources().getString(R.string.food8)) ){
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.lhong);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("ไข่กระจายแฮม\nข้าวราดคะน้าหมูกรอบ\nข้าวผัดต้มยำไก่");

        }if (name.equals(getResources().getString(R.string.food9))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.chickenrice);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("ข้าวมันไก่ทอด");

        }if (name.equals(getResources().getString(R.string.food10))) {
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);

        }if (name.equals(getResources().getString(R.string.food11)) ){
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);

        }if (name.equals(getResources().getString(R.string.dessert1))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.parabola);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("Ice cream with homemade brownie");

        }if (name.equals(getResources().getString(R.string.dessert2)) ){
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.tw);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("วาฟเฟิล\nผลไม้สด");


        }if (name.equals(getResources().getString(R.string.dessert3))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.wan);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);

        }if (name.equals(getResources().getString(R.string.dessert4))) {

        }if (name.equals(getResources().getString(R.string.beverage1))) {
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);

        }if (name.equals(getResources().getString(R.string.beverage2))) {
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("โยเกิร์ตปั่น ปีโป้\nผลไม้รวมปั่น\nโกโก้โอริโอ้ปั่น");

        }if (name.equals(getResources().getString(R.string.beverage3))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.suchada);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("น้ำผลไม้ปั่นเกล็ดหิมะ");

        }if (name.equals(getResources().getString(R.string.beverage4))) {
            ImageView image_restaurant = (ImageView) findViewById(R.id.image_restaurant);
            image_restaurant.setImageResource(R.drawable.coffee);
            TextView menu_restaurant = (TextView) findViewById(R.id.menu_restaurant);
            menu_restaurant.setText("Espresso\npinky milk\nขนงปังปิ้งchocolate");

        }


    }
    public void toReview(View view){
        Intent intent2= new Intent(this, Review.class);
        intent2.putExtra(RES_NAME, name);
        startActivity(intent2);
    }
}