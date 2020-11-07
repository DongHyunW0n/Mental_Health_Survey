package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_3_4 extends AppCompatActivity {

    Button exit_button_3_4;
    Button third_4_1;
    Button third_4_2;
    Button third_4_3;
    Button third_4_4;
    Button third_4_5;
    int[] arr_3_4 = new int[50];


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_3_4);

        exit_button_3_4 = findViewById(R.id.exit_button_3_4);
        exit_button_3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_4.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });

        third_4_1= findViewById(R.id.third_4_1);
        third_4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_4.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });
        third_4_2 = findViewById(R.id.third_4_2);
        third_4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_4.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });
        third_4_3 = findViewById(R.id.third_4_3);
        third_4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_4.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });

        third_4_4 = findViewById(R.id.third_4_4);
        third_4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_4.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });
        third_4_5= findViewById(R.id.third_4_5);
        third_4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_4.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });

    }
}