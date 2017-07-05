package com.example.gaurav.hungergo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    int iz=0;
    ProgressBar progress;
int progressstatus=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
init();
        work();
    }

    private void init() {

        progress= (ProgressBar) findViewById(R.id.progressBarSplitScreen);


    }

    private void work() {


        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                iz=iz+1;
                progress.setProgress(iz);
                Intent i = new Intent(MainActivity.this, LoginscreenActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }




}
