package com.example.gaurav.hungergo;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class ForgetPassword extends AppCompatActivity {
    TextView goback;
    EditText dobbuttonforget,email_forget;
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        init();
        controllistner();
    }

    private void init() {

        goback= (TextView) findViewById(R.id.goback);
        dobbuttonforget= (EditText) findViewById(R.id.forgetpasswordDOB);
email_forget= (EditText) findViewById(R.id.edittextforgetemail);
    }

    private void controllistner() {
        email_forget.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
if(email_forget.getText().toString().matches("^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$"))
                {}
                else {
                    email_forget.setError("enter email correctely");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ForgetPassword.this,Loginmain.class);
                startActivity(i);
                finish();
            }
        });
    dobbuttonforget.setOnTouchListener(new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            i++;
            if(i==1)
            {
                dateselect();

            }
            return false;
        }
    });
    }

    private void dateselect() {

            Calendar calender=Calendar.getInstance();
            int z=0;
            int day=  calender.get(Calendar.DAY_OF_MONTH);
            int month =calender.get(Calendar.MONTH);
            int year=calender.get(Calendar.YEAR);
            DatePickerDialog datepickerdialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    dobbuttonforget.setText(dayOfMonth+"-"+(month+1)+"-"+year);
                    String date_checker=dobbuttonforget.getText().toString();



                }
            },year,month,day);
            datepickerdialog.show();

    }

}
