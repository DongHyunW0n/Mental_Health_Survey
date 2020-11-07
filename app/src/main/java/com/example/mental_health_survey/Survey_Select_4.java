package com.example.mental_health_survey;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_Select_4 extends AppCompatActivity {



    Button select_4_1;
    Button select_4_out;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_select_4);


        select_4_out = findViewById(R.id.select_4_out);
        select_4_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select_4.this,Survey_Select.class);
                startActivity(intent);
            }
        });


        select_4_1 = findViewById(R.id.select_4_1);
        select_4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select_4.this,Survey_Explain_4_1.class);
                startActivity(intent);
            }
        });










    }
}