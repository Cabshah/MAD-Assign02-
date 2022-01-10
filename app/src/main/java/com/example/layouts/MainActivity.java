package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText neT = findViewById(R.id.Name);
        EditText regeT= findViewById(R.id.reg);
        EditText roleT =findViewById(R.id.Rollno);
        EditText emaileT = findViewById(R.id.email);
        ImageButton btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =neT.getText().toString();
                String reg = regeT.getText().toString();
                String roll_no =roleT.getText().toString();
                String email = emaileT.getText().toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name",name);
                intent.putExtra("Regiteration",reg);
                intent.putExtra("Roll_no",roll_no);
                intent.putExtra("Email",email);
              startActivity(intent);
            }
        });







    }
}