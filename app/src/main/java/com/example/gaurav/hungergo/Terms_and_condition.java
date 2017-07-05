package com.example.gaurav.hungergo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Terms_and_condition extends AppCompatActivity {
    TextView goback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_condition);
        init();
        controllistner();


    }

    private void init() {
goback= (TextView) findViewById(R.id.tcgoback);
    }

    private void controllistner() {

goback.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(Terms_and_condition.this,LoginscreenActivity.class);
        startActivity(i);
    }
});
    }
}
