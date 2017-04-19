package com.example.shivanikaushal.brokemanagerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class NecessityList extends AppCompatActivity {
    CheckBox food1,shopping1,entment1,wolege1,tport1,hh1,other1,hc1;
    Button next1,back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necessity_list);
        food1=(CheckBox)findViewById(R.id.food1);
        shopping1=(CheckBox)findViewById(R.id.shopping1);
        entment1=(CheckBox)findViewById(R.id.entertainment1);
        wolege1=(CheckBox)findViewById(R.id.wolege1);
        tport1=(CheckBox)findViewById(R.id.transport1);
        hh1=(CheckBox)findViewById(R.id.household1);
        other1=(CheckBox)findViewById(R.id.healthcare1);
        hc1=(CheckBox)findViewById(R.id.other1);
        next1=(Button)findViewById(R.id.nextne);
        back1=(Button)findViewById(R.id.backne);


       back1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(),WelcomePage.class);

               startActivity(i);
           }
       });

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),NecessityAmount.class);

                if (food1.isChecked())
                {

                }
                startActivity(i);
            }
        });

    }
}

