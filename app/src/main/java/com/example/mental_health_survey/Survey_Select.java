package com.example.mental_health_survey;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_Select extends AppCompatActivity {



    Button select_out;
    Button select_1;
    Button select_2;
    Button select_3;
    Button select_4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_select);


        select_out = findViewById(R.id.select_out);
        select_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select.this,Information_Gathering.class);
                startActivity(intent);
            }
        });





        select_1 = findViewById(R.id.select_1);
        select_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select.this,Survey_Select_1.class);
                startActivity(intent);
            }
        });




        select_2 = findViewById(R.id.select_2);
        select_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select.this,Survey_Select_2.class);
                startActivity(intent);
            }
        });
        select_3 = findViewById(R.id.select_3);
        select_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });

        select_4 = findViewById(R.id.select_4);
        select_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select.this,Survey_Select_4.class);
                startActivity(intent);
            }
        });



    }
}
