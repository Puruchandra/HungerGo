package com.example.gaurav.hungergo.braverages_section.activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.gaurav.hungergo.Dashboard_main;
import com.example.gaurav.hungergo.R;
import com.example.gaurav.hungergo.braverages_section.myadaptar.MyArrayAdapter;
import com.example.gaurav.hungergo.braverages_section.pojo.ListPojo;
import com.example.gaurav.hungergo.cart_custom_list.activity.Cart_Checkout;

import java.util.ArrayList;

public class Braveragersection extends AppCompatActivity {
    int backButtonCount = 0;
    ListView listView;
    //    FloatingActionButton goto_cart_button;
    ImageView goback;
    com.github.clans.fab.FloatingActionButton cartbutton;
    ArrayList<ListPojo> pojoArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_braveragersection);
        init();
        fillValues();
        MyArrayAdapter myArrayAdapter = new MyArrayAdapter(this, R.layout.listview_vegsection, pojoArrayList);
        listView.setAdapter(myArrayAdapter);
        controllistner();
    }

    private void init() {
        listView = (ListView) findViewById(R.id.listview_bravarages_section);
        //goto_cart_button= (FloatingActionButton) findViewById(R.id.floatingActionButton_vegsection);
        goback = (ImageView) findViewById(R.id.imagebackclick_bravaragessection);
    goback.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent(Braveragersection.this, Dashboard_main.class);
            startActivity(i);
        }
    });
        cartbutton= (com.github.clans.fab.FloatingActionButton) findViewById(R.id.goto_cart_bravrage);

    }

    private void fillValues() {
        // for (int i=0;i<10;++i)
        //{
        ListPojo listPojo1 = new ListPojo();
        listPojo1.setDiscription("1 cup cofee");
        listPojo1.setImage(R.drawable.bra1_cofee);
        listPojo1.setItem_name("Cofee");
        listPojo1.setPrice("₹ 35");
        listPojo1.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo1);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo2 = new ListPojo();
        listPojo2.setDiscription("1 cup cold cofee");
        listPojo2.setImage(R.drawable.bra1_coldcofee);
        listPojo2.setItem_name("Cold Cofee");
        listPojo2.setPrice("₹ 45");
        listPojo2.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo2);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo3 = new ListPojo();
        listPojo3.setDiscription("1 cup tea");
        listPojo3.setImage(R.drawable.bra2_tea);
        listPojo3.setItem_name("Tea");
        listPojo3.setPrice("₹ 15");
        listPojo3.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo3);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo4 = new ListPojo();
        listPojo4.setDiscription("1 glass chilled lassi");
        listPojo4.setImage(R.drawable.bra4_lassi);
        listPojo4.setItem_name("Lassi");
        listPojo4.setPrice("₹ 35");
        listPojo4.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo4);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo5 = new ListPojo();

        listPojo5.setDiscription("1 glass butter milk");
        listPojo5.setImage(R.drawable.bra5_butter_milk);
        listPojo5.setItem_name("Butter Milk");
        listPojo5.setPrice("₹ 30");
        listPojo5.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo5);
//        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo6 = new ListPojo();
        listPojo6.setDiscription("1glass masala butter milk with masala");
        listPojo6.setImage(R.drawable.bra6_masala_butter_milk);
        listPojo6.setItem_name("Masala Butter Milk");
        listPojo6.setPrice("₹ 35");
        listPojo6.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo6);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo7 = new ListPojo();
        listPojo7.setDiscription("Kinley water bottle");
        listPojo7.setImage(R.drawable.bra7_mineral_watar);
        listPojo7.setItem_name("Mineral Water");
        listPojo7.setPrice("₹ 18");
        listPojo7.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo7);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo8 = new ListPojo();
        listPojo8.setDiscription("Soda water 1 bottle");
        listPojo8.setImage(R.drawable.bra8_soda_watar);
        listPojo8.setItem_name("Soda Water");
        listPojo8.setPrice("₹ 15");
        listPojo8.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo8);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo9 = new ListPojo();
        listPojo9.setDiscription("Any cold-drink(300ml)");
        listPojo9.setImage(R.drawable.bra9_soft_drink);
        listPojo9.setItem_name("Soft drink");
        listPojo9.setPrice("₹ 13");
        listPojo9.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo9);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo10 = new ListPojo();

        listPojo10.setDiscription("1glass nibu pani");
        listPojo10.setImage(R.drawable.bra10_nimbu_pani);
        listPojo10.setItem_name("Nibu Pani");
        listPojo10.setPrice("₹ 16");
        listPojo10.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo10);
    }

    @Override
    public void onBackPressed()

    {

        if (backButtonCount >= 2)

        {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Press the back button once again to close the application.", Toast.LENGTH_SHORT).show();
            ++backButtonCount;
        }
    }

    private void controllistner() {
        cartbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Braveragersection.this, Cart_Checkout.class);
                startActivity(i);
            }
        });
    }
}