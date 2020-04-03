package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button but1 =(Button)findViewById(R.id.button6);
        Button but2 = (Button)findViewById(R.id.button7);
        Button but3 = (Button)findViewById(R.id.button8);
        Button but4 = (Button)findViewById(R.id.button9);
        Button but5 = (Button)findViewById(R.id.button10);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTwo = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intentTwo);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentThree = new Intent(SecondActivity.this,FourthActivity.class);
                startActivity(intentThree);
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFour = new Intent(SecondActivity.this,FifthActivity.class);
                startActivity(intentFour);
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFive = new Intent(SecondActivity.this,SixthActivity.class);
                startActivity(intentFive);
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSix = new Intent(SecondActivity.this,SeventhActivity.class);
                startActivity(intentSix);
                }
        });
    }
}
