package com.example.mental_health_survey;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_Select_1 extends AppCompatActivity {



    Button select_1;
    Button select_1_out;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_select_1);


        select_1_out = findViewById(R.id.select_1_out);
        select_1_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select_1.this,Survey_Select.class);
                startActivity(intent);
            }
        });


        select_1 = findViewById(R.id.select_1_1);
        select_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select_1.this,Survey_Explain_1_1.class);
                startActivity(intent);
            }
        });










    }
}