package com.example.shivanikaushal.brokemanagerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Moneygowhere extends AppCompatActivity {
    CheckBox food,shopping,entment,wolege,tport,hh,other,hc;
    Button next,back;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moneygowhere);
        food=(CheckBox)findViewById(R.id.cbfood);
        shopping=(CheckBox)findViewById(R.id.cbshopping);
        entment=(CheckBox)findViewById(R.id.cbentertainment);
        wolege=(CheckBox)findViewById(R.id.cbworkcollege);
        tport=(CheckBox)findViewById(R.id.cbtransport);
        hh=(CheckBox)findViewById(R.id.cbhousehold);
        other=(CheckBox)findViewById(R.id.cbhealthcare);
        hc=(CheckBox)findViewById(R.id.cbother);
        next=(Button)findViewById(R.id.btnnext2);
        back=(Button)findViewById(R.id.btnback2);

       next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),NecessityList.class);
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MonthlyIncome.class);
                startActivity(i);
            }
        });


    }
}
