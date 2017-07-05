package com.example.gaurav.hungergo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Loginmain extends AppCompatActivity {
    TextView register_click,forgetPasswordClick;
    Button login_button;
   EditText email,password;
String email_data,password_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginmain);
        init();
        controllistner();
    }

    private void init() {
        register_click= (TextView) findViewById(R.id.loginscreenregister);
        forgetPasswordClick= (TextView) findViewById(R.id.loginscreenforgetpassword);
    login_button= (Button) findViewById(R.id.loginbutton);
        email= (EditText) findViewById(R.id.editTextEmail);
        password= (EditText) findViewById(R.id.editTextPassword);

    }

    private void controllistner() {
        register_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Loginmain.this,RegistrationActivity.class);
                startActivity(i);
                finish();
            }
        });
        forgetPasswordClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Loginmain.this,ForgetPassword.class);
                startActivity(i);
                finish();
            }
        });
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login_functions();
            }
        });
    }

    private void login_functions() {
        email_data=email.getText().toString();
        password_data=password.getText().toString();

        if(email.getText().toString().isEmpty()||password.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Username and password should be field", Toast.LENGTH_SHORT).show();
        }
        else if(email_data.equals("xyz@gmail.com")&&password_data.equals("gaurav123"))
        {
            Intent i=new Intent(Loginmain.this,Dashboard_main.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Invalid email/password", Toast.LENGTH_SHORT).show();
        }

    }


}
