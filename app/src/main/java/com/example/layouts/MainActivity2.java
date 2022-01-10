package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String reg = intent.getStringExtra("Regiteration");
        String roll_no = intent.getStringExtra("Roll_no");
        String email = intent.getStringExtra("Email");

        TextView Tresult = findViewById(R.id.result);
        Tresult.setText("Name:" +name+ "\nRegisteration no:"+reg+ "\nRoll no :"+roll_no+ "\nEmail :" +email);

    }
}