package com.example.shivanikaushal.brokemanagerapp;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Register extends AppCompatActivity {

    EditText name, email2,pass2,repass2;

    Button back, next;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = (EditText) findViewById(R.id.etname);
        email2 = (EditText) findViewById(R.id.etemail2);
        pass2 = (EditText) findViewById(R.id.etpassword2);
        repass2 = (EditText) findViewById(R.id.etrepass);

        back = (Button) findViewById(R.id.btnbackward);
        next = (Button) findViewById(R.id.btnforward);
        mDatabase = FirebaseDatabase.getInstance().getReference();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity((new Intent(Register.this, MonthlyIncome.class)));
                String x = name.getText().toString().trim();
                String y = email2.getText().toString().trim();
                String z = pass2.getText().toString().trim();
                String w = repass2.getText().toString().trim();
                HashMap<String,String> datamap = new HashMap<String, String>();
                datamap.put("Name",x);
                datamap.put("Email",y);
                datamap.put("Password",z);
                datamap.put("Re-enter Password",w);
                mDatabase.push().setValue(datamap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful())
                        {

                        }
                        else
                        {
                            Toast.makeText(Register.this,"Error ",Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity((new Intent(Register.this, WelcomePage.class)));

            }
        });


    }
}