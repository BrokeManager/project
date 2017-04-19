package com.example.shivanikaushal.brokemanagerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NecessityAmount extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necessity_amount);
        String s;
        s=getIntent().getStringExtra("Food");





    }
}
