package com.example.gaurav.hungergo;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

import static com.example.gaurav.hungergo.R.id.edittextregistrationPassword;

public class RegistrationActivity extends AppCompatActivity {

Button registerbutton;
    EditText username, password,confirmpassword,birth_date,email;
int i=0,x1=0,x2=0,x3=0,x4=0,x5=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        init();

        controllistner();
    }

    private void init() {
        username= (EditText) findViewById(R.id.edittextregistrationname);
        password= (EditText) findViewById(edittextregistrationPassword);
        email= (EditText) findViewById(R.id.edittextregistrationemail);
        confirmpassword= (EditText) findViewById(R.id.edittextregistrationConPassword);
        birth_date= (EditText) findViewById(R.id.edittextregistrationDOB);
        registerbutton= (Button) findViewById(R.id.register_button);
    }

    private void controllistner() {
        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                x1++;
                if(username.getText().toString().matches("^[a-z0-9_-]{3,16}$"))
                {}
                else{
                    username.setError("enter username correctely");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                x2++;
                if(email.getText().toString().matches("^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$"))
                {}
                else {
                    email.setError("enter email correctely");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {
                x3++;
                if(password.getText().toString().matches("^[a-z0-9_-]{6,18}")){

                }
                else{
                    password.setError("recheck password");
                }

            }
        });
        confirmpassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

x4++;                if(password.getText().toString().equals(confirmpassword.getText().toString()))
                {

                }
                else {
                    confirmpassword.setError("Passsword did not matched");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        birth_date.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                i++;
                x5++;
              if(i==1)
              {
                  datepicker();
              }
                return  false;


            }
        });
        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(x1==0)
                {
                    username.setError("user name cannot be blank");
                }

                if(x2==0)
                {
                    email.setError("email cannot be left blank");
                }
                if(x3==0)
                {
                    password.setError("password plank cannot left blank");
                }

                if(x4==0)
                {
                    confirmpassword.setError("confirm password cannot left blank");
                }

                if(x5==0)
                {
                    birth_date.setError("confirm password should be blamk");
                }

            }
        });


    }

    public void datepicker() {
        Calendar calender=Calendar.getInstance();
        int z=0;
        int day=  calender.get(Calendar.DAY_OF_MONTH);
        int month =calender.get(Calendar.MONTH);
        int year=calender.get(Calendar.YEAR);
        DatePickerDialog  datepickerdialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
birth_date.setText(dayOfMonth+"-"+(month+1)+"-"+year);
                String date_checker=birth_date.getText().toString();



            }
        },year,month,day);
datepickerdialog.show();
    }

}
