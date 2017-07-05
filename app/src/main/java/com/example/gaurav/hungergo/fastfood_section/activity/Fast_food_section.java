package com.example.gaurav.hungergo.fastfood_section.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.gaurav.hungergo.Dashboard_main;
import com.example.gaurav.hungergo.R;
import com.example.gaurav.hungergo.cart_custom_list.activity.Cart_Checkout;
import com.example.gaurav.hungergo.fastfood_section.myadaptar.MyArrayAdapter;
import com.example.gaurav.hungergo.fastfood_section.pojo.ListPojo;
import com.github.clans.fab.FloatingActionButton;

import java.util.ArrayList;

public class Fast_food_section extends AppCompatActivity {
    ListView listView;
        ImageView goback;
   int backButtonCount=0;
    FloatingActionButton cartbutton;
    ArrayList<ListPojo> pojoArrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food_section);
        init();
        fillValues();
        MyArrayAdapter myArrayAdapter=new MyArrayAdapter(this,R.layout.listview_vegsection,pojoArrayList);
        listView.setAdapter(myArrayAdapter);
        controllistner();
    }

    private void init() {
        listView= (ListView) findViewById(R.id.listview_fastfood_section);
        //goto_cart_button= (FloatingActionButton) findViewById(R.id.floatingActionButton_vegsection);
        goback= (ImageView) findViewById(R.id.imagebackclick_fastfoodsection);
 cartbutton= (FloatingActionButton) findViewById(R.id.goto_cart_fastfood);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Fast_food_section.this, Dashboard_main.class);
                startActivity(i);
            }
        });
    }

    private void fillValues() {
        // for (int i=0;i<10;++i)
        //{
        ListPojo listPojo1=new ListPojo();
        listPojo1.setDiscription(" fresh crispy french fries ");
        listPojo1.setImage(R.drawable.fast1_french_fries);
        listPojo1.setItem_name("French Fries");
        listPojo1.setPrice("₹ 35");
        listPojo1.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo1);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo2=new ListPojo();
        listPojo2.setDiscription("2 pcs pav with bhagi");
        listPojo2.setImage(R.drawable.fast1_fpav_bhaji);
        listPojo2.setItem_name("Pav Bhaji");
        listPojo2.setPrice("₹ 40");
        listPojo2.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo2);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo3=new ListPojo();
        listPojo3.setDiscription("1pcs band with butter");
        listPojo3.setImage(R.drawable.fast2_band_makhan);
        listPojo3.setItem_name("Band Makhab");
        listPojo3.setPrice("₹ 25");
        listPojo3.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo3);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo4=new ListPojo();
        listPojo4.setDiscription("Fresh Veg burger");
        listPojo4.setImage(R.drawable.fast3_burger);
        listPojo4.setItem_name("Veg Burger");
        listPojo4.setPrice("₹ 35");
        listPojo4.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo4);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo5=new ListPojo();

        listPojo5.setDiscription("full plate chau mien");
        listPojo5.setImage(R.drawable.fast5_chumin);
        listPojo5.setItem_name("Chau mien ");
        listPojo5.setPrice("₹ 50");
        listPojo5.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo5);
//        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo6=new ListPojo();
        listPojo6.setDiscription("6 pcs momos");
        listPojo6.setImage(R.drawable.fast6_momos);
        listPojo6.setItem_name("Momoes");
        listPojo6.setPrice("₹ 35");
        listPojo6.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo6);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo7=new ListPojo();
        listPojo7.setDiscription("1pcs veg role");
        listPojo7.setImage(R.drawable.fast7_vegrolle);
        listPojo7.setItem_name("Veg role");
        listPojo7.setPrice("₹ 25");
        listPojo7.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo7);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo8=new ListPojo();
        listPojo8.setDiscription("2 pcs somose");
        listPojo8.setImage(R.drawable.fast8_somose);
        listPojo8.setItem_name("Somose");
        listPojo8.setPrice("₹ 30");
        listPojo8.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo8);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo9=new ListPojo();
        listPojo9.setDiscription("Half plate chilli paneer");
        listPojo9.setImage(R.drawable.fast9_chilli_paneer);
        listPojo9.setItem_name("Chilli Paneer");
        listPojo9.setPrice("₹ 70");
        listPojo9.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo9);
        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo10=new ListPojo();

        listPojo10.setDiscription("Full plate manchurian");
        listPojo10.setImage(R.drawable.fast10_veg_manchurian);
        listPojo10.setItem_name("Veg manchurian");
        listPojo10.setPrice("₹ 55");
        listPojo10.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo10);
//        //next item ListPojo listPojo=new ListPojo();
        ListPojo listPojo11=new ListPojo();
        listPojo11.setDiscription("Half plate");
        listPojo11.setImage(R.drawable.fast11_honey_chilli_potato);
        listPojo11.setItem_name("Honey Chilli Potato");
        listPojo11.setPrice("₹ 60");
        listPojo11.setSymbolImage(R.drawable.vegsymbol);
        pojoArrayList.add(listPojo11);
//        //next item ListPojo listPojo=new ListPojo();
//        ListPojo listPojo12=new ListPojo();
//        listPojo12.setDiscription("200gm Poha");
//        listPojo12.setImage(R.drawable.veg11_pooha);
//        listPojo12.setItem_name("Poha ");
//        listPojo12.setPrice("₹ 55");
//        listPojo12.setSymbolImage(R.drawable.vegsymbol);
//        pojoArrayList.add(listPojo12);
//        //next item ListPojo listPojo=new ListPojo();
//        ListPojo listPojo13=new ListPojo();
//        listPojo13.setDiscription("Palak paneer 200g");
//        listPojo13.setImage(R.drawable.veg13_palak_paneer);
//        listPojo13.setItem_name("Palak Paneer ");
//        listPojo13.setPrice("₹ 126");
//        listPojo13.setSymbolImage(R.drawable.vegsymbol);
//        pojoArrayList.add(listPojo13);
//        //next item ListPojo listPojo=new ListPojo();
//        ListPojo listPojo14=new ListPojo();
//        listPojo14.setDiscription("1 pcs Butter Roti");
//        listPojo14.setImage(R.drawable.veg14_butter_roti);
//        listPojo14.setItem_name("Butter Roti");
//        listPojo14.setPrice("₹ 22");
//        listPojo14.setSymbolImage(R.drawable.vegsymbol);
//        pojoArrayList.add(listPojo14);
//        //next item ListPojo listPojo=new ListPojo();
//        ListPojo listPojo15=new ListPojo();
//
//        listPojo15.setDiscription("200gm Kadhai paneer");
//        listPojo15.setImage(R.drawable.veg15_kadhi_paneer);
//        listPojo15.setItem_name("Kadhai Paneer");
//        listPojo15.setPrice("₹ 136");
//        listPojo15.setSymbolImage(R.drawable.vegsymbol);
//        pojoArrayList.add(listPojo15);
////        //next item ListPojo listPojo=new ListPojo();
//        ListPojo listPojo16=new ListPojo();
//        listPojo16.setDiscription("200g Sahi paneer");
//        listPojo16.setImage(R.drawable.veg16_sahi_paneer);
//        listPojo16.setItem_name("Sahi Paneer");
//        listPojo16.setPrice("₹ 136");
//        listPojo16.setSymbolImage(R.drawable.vegsymbol);
//        pojoArrayList.add(listPojo16);
//        //next item ListPojo listPojo=new ListPojo();
//        ListPojo listPojo17=new ListPojo();
//        listPojo17.setDiscription("Paneer butter masala 200g");
//        listPojo17.setImage(R.drawable.veg17_paneer_butter_masala);
//        listPojo17.setItem_name("Paneer Butter Masala");
//        listPojo17.setPrice("₹ 136");
//        listPojo17.setSymbolImage(R.drawable.vegsymbol);
//        pojoArrayList.add(listPojo17);
//        //next item ListPojo listPojo=new ListPojo();
//        ListPojo listPojo18=new ListPojo();
//        listPojo18.setDiscription("1pcs Butter nan");
//        listPojo18.setImage(R.drawable.veg18_butter_nan);
//        listPojo18.setItem_name("Butter Nan");
//        listPojo18.setPrice("₹ 22");
//        listPojo18.setSymbolImage(R.drawable.vegsymbol);
//        pojoArrayList.add(listPojo18);
//        //next item ListPojo listPojo=new ListPojo();
//        ListPojo listPojo19=new ListPojo();
//        listPojo19.setDiscription("1 pcs Plain Roti");
//        listPojo19.setImage(R.drawable.veg19_plain_roti);
//        listPojo19.setItem_name("Plain Roti");
//        listPojo19.setPrice("₹ 17");
//        pojoArrayList.add(listPojo19);
//        listPojo19.setSymbolImage(R.drawable.vegsymbol);
//        //next item ListPojo listPojo=new ListPojo();
//        ListPojo listPojo20=new ListPojo();
//
//        listPojo20.setDiscription("250g fried rice");
//        listPojo20.setImage(R.drawable.veg20_fried_rice);
//        listPojo20.setItem_name("Fried Rice");
//        listPojo20.setPrice("₹ 75");
//        listPojo20.setSymbolImage(R.drawable.vegsymbol);
//        pojoArrayList.add(listPojo20);
////        //next item ListPojo listPojo=new ListPojo();
//
//        ListPojo listPojo21=new ListPojo();
//        listPojo21.setDiscription("Fried dal 300gm");
//        listPojo21.setImage(R.drawable.veg21_dal_fri);
//        listPojo21.setItem_name("Dal fry");
//        listPojo21.setPrice("₹ 83");
//        listPojo21.setSymbolImage(R.drawable.vegsymbol);
//        pojoArrayList.add(listPojo21);
////        //}
    }

    @Override
    public void onBackPressed()

    {

        if(backButtonCount >= 2)

        {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Press the back button once again to close the application.", Toast.LENGTH_SHORT).show();
            ++backButtonCount;
        }
    }
    private void controllistner() {
        cartbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Fast_food_section.this, Cart_Checkout.class);
                startActivity(i);
            }
        });
    }
}
