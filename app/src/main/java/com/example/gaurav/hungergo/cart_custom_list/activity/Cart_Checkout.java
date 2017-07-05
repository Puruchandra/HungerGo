package com.example.gaurav.hungergo.cart_custom_list.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.gaurav.hungergo.Dashboard_main;
import com.example.gaurav.hungergo.R;
import com.example.gaurav.hungergo.cart_custom_list.adapter.MyArrayAdapter;
import com.example.gaurav.hungergo.cart_custom_list.pojo.Mypojo;

import java.util.ArrayList;

public class Cart_Checkout extends AppCompatActivity {

int backbuttoncount=0;
    private ListView listView;
    private Button checkout_button;
    private ImageView goback;
    private ArrayList<Mypojo> pojoArrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart__checkout);
        init();
        fillvalues();
        MyArrayAdapter myArrayAdapter=new MyArrayAdapter(this,R.layout.cart_list_design,pojoArrayList);
        listView.setAdapter(myArrayAdapter);

controllistner();
    }

    private void init() {
        listView= (ListView) findViewById(R.id.listview_cart);
        checkout_button= (Button) findViewById(R.id.button_checkout_cart);
        goback= (ImageView) findViewById(R.id.imagebackclick_cart);
    }

    private void fillvalues() {


        for (int i = 0; i < 10; ++i) {
            Mypojo mypojo1 = new Mypojo();
            mypojo1.setCart_item_name("Something");
            mypojo1.setCart_item_price("₹10");
            mypojo1.setCartimage(R.drawable.non_veg4_chicken_do_payaza);
            pojoArrayList.add(mypojo1);
        }
    }
    @Override
    public void onBackPressed()

    {

        if (backbuttoncount >= 2)

        {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Press the back button once again to close Hunger go.", Toast.LENGTH_SHORT).show();
            ++backbuttoncount;
        }
    }
    private void controllistner() {
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Cart_Checkout.this, Dashboard_main.class);
                startActivity(i);
            }
        });
    }
}
