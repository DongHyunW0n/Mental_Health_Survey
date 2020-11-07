package com.example.mental_health_survey;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_Select_3 extends AppCompatActivity {



    Button select_3_1;
    Button select_3_2;
    Button select_3_3;
    Button select_3_4;

    Button select_3_out;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_select_3);

        select_3_out = findViewById(R.id.select_3_out);
        select_3_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select_3.this,Survey_Select.class);
                startActivity(intent);
            }
        });





        select_3_1 = findViewById(R.id.select_3_1);
        select_3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select_3.this,Survey_Explain_3_1.class);
                startActivity(intent);
            }
        });

        select_3_2 = findViewById(R.id.select_3_2);
        select_3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select_3.this,Survey_Explain_3_2.class);
                startActivity(intent);
            }
        });
        select_3_3 = findViewById(R.id.select_3_3);
        select_3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select_3.this,Survey_Explain_3_3.class);
                startActivity(intent);
            }
        });
        select_3_4 = findViewById(R.id.select_3_4);
        select_3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Select_3.this,Survey_Explain_3_4.class);
                startActivity(intent);
            }
        });






    }
}