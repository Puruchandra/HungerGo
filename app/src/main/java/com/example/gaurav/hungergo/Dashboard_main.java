package com.example.gaurav.hungergo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;
import com.example.gaurav.hungergo.braverages_section.activity.Braveragersection;
import com.example.gaurav.hungergo.fastfood_section.activity.Fast_food_section;
import com.example.gaurav.hungergo.non_veg_section.activity.Nonvegsection;
import com.example.gaurav.hungergo.sweets_section.activity.Sweets_section;
import com.example.gaurav.hungergo.vegSectionCustomList.activity.Veg_section;

public class Dashboard_main extends AppCompatActivity {
    ViewFlipper flip;
    int backButtonCount=0;
    ImageView flip1,flip2,flip3,flip4,flip5,dashboard1,dashboard2,dashboard3,dashboard4,dashboard5,goback;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_main);
        init();
        gliedloader();
        flipping();
        controllistner();
    }

    private void init() {

        flip1= (ImageView) findViewById(R.id.flipper1);
        flip2= (ImageView) findViewById(R.id.flipper2);
         flip3= (ImageView) findViewById(R.id.flipper3);
        flip4= (ImageView) findViewById(R.id.flipper4);
         flip5= (ImageView) findViewById(R.id.flipper5);
         dashboard1= (ImageView) findViewById(R.id.dashboard1);

        dashboard2= (ImageView) findViewById(R.id.dashboard2);

        dashboard3= (ImageView) findViewById(R.id.dashboard3);

        dashboard4= (ImageView) findViewById(R.id.dashboard4);

        dashboard5= (ImageView) findViewById(R.id.dashboard5);
        goback= (ImageView) findViewById(R.id.imagebackclickdashboard);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Dashboard_main.this,LoginscreenActivity.class);
                startActivity(i);
            }
        });

    }

    private void controllistner() {
        dashboard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Dashboard_main.this, Veg_section.class);
                startActivity(i);
            }
        });
        dashboard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent i=new Intent(Dashboard_main.this,Nonvegsection.class);
                startActivity(i);
            }
        });
        dashboard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Dashboard_main.this, Braveragersection.class);
                startActivity(i);
            }
        });
        dashboard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Dashboard_main.this, Fast_food_section.class);
                startActivity(i);
            }
        });
        dashboard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Dashboard_main.this, Sweets_section.class);
                startActivity(i);
            }
        });
    }

    private void gliedloader() {
        Glide.with(this).load(R.drawable.flip1).into(flip1);

        Glide.with(this).load(R.drawable.flip2).into(flip2);

        Glide.with(this).load(R.drawable.flip3).into(flip3);

        Glide.with(this).load(R.drawable.flip4).into(flip4);

        Glide.with(this).load(R.drawable.flip5).into(flip5);

        Glide.with(this).load(R.drawable.dashboard1).into(dashboard1);
        Glide.with(this).load(R.drawable.dashboard2).into(dashboard2);
        Glide.with(this).load(R.drawable.dashboard3).into(dashboard3);
        Glide.with(this).load(R.drawable.dashboard4).into(dashboard4);
        Glide.with(this).load(R.drawable.dashboard5).into(dashboard5);




    }

    private void flipping() {


        flip= (ViewFlipper) findViewById(R.id.imageflipper_dashboard);
        flip.setFlipInterval(3000);
        flip.startFlipping();
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
}
