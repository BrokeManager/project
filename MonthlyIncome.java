package com.example.shivanikaushal.brokemanagerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MonthlyIncome extends AppCompatActivity {
    Button btnext,btnback;
    EditText income;
    RadioButton r1,r2,r3;
    TextView nameview;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly_income);
        income=(EditText)findViewById(R.id.etincome);
        btnext=(Button)findViewById(R.id.btnext);
        btnback=(Button)findViewById(R.id.btnback);
        r1=(RadioButton) findViewById(R.id.rbday);
        r2=(RadioButton) findViewById(R.id.rbweek);
        r3=(RadioButton) findViewById(R.id.rbmonth);
        income.getText().toString();
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Name");
        nameview = (TextView)findViewById(R.id.etname);
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue().toString();
                nameview.setText(name);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
           Intent i=new Intent(getApplicationContext(),Register.class);
             startActivity(i);
         }
     });
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getApplicationContext(),Moneygowhere.class);
                startActivity(i2);
            }
        });
    }
}
