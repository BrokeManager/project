package com.example.shivanikaushal.brokemanagerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    EditText id,pw;
    Button cont,behind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        id=(EditText)findViewById(R.id.etemail);
        pw=(EditText)findViewById(R.id.etpassword);
        cont=(Button)findViewById(R.id.btncont1);
        behind=(Button)findViewById(R.id.btnbehind);

        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        behind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),WelcomePage.class);
                startActivity(i);
            }
        });

    }
}
