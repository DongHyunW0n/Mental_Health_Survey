package com.example.mental_health_survey;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_Select_2 extends AppCompatActivity {



    Button select_2_1;
    Button select_2_2;
    Button select_2_out;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_select_2);

        select_2_out = findViewById(R.id.select_2_out);
        select_2_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select_2.this,Survey_Select.class);
                startActivity(intent);
            }
        });





        select_2_1 = findViewById(R.id.select_2_1);
        select_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select_2.this,Survey_Explain_2_1.class);
                startActivity(intent);
            }
        });

        select_2_2 = findViewById(R.id.select_2_2);
        select_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select_2.this,Survey_Explain_2_2.class);
                startActivity(intent);
            }
        });






    }
}