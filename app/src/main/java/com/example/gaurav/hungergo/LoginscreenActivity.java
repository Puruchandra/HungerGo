package com.example.gaurav.hungergo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginscreenActivity extends AppCompatActivity {
    TextView login_button,register_button,termAndConditonClick;
ImageView facebookclick,twitterclick,gplusclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginscreen);
        init();
        method_listner();
    }

    private void init() {
        login_button= (TextView) findViewById(R.id.loginbutton_mainscreen);
        register_button= (TextView) findViewById(R.id.registerbutton_mainscreen);
        facebookclick= (ImageView) findViewById(R.id.gplusblock);
        twitterclick= (ImageView) findViewById(R.id.twitterblock);
        gplusclick= (ImageView) findViewById(R.id.fbblock);
        termAndConditonClick= (TextView) findViewById(R.id.termandcondition);

    }

    private void method_listner() {
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginscreenActivity.this,Loginmain.class);
                startActivity(i);

            }
        });
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginscreenActivity.this,RegistrationActivity.class);
                startActivity(i);

            }
        });
        facebookclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginscreenActivity.this,Web1.class);
                startActivity(i);
                finish();
            }
        });  twitterclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginscreenActivity.this,Web2.class);
                startActivity(i);
                finish();
            }
        });  gplusclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginscreenActivity.this,Web3.class);
                startActivity(i);
                finish();
            }
        });
        termAndConditonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginscreenActivity.this,Terms_and_condition.class);
                startActivity(i);

            }
        });
    }
}
