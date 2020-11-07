package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_3_2 extends AppCompatActivity {

    Button exit_button6;
    Button third_2_1;
    Button third_2_2;
    Button third_2_3;
    Button third_2_4;
    Button third_2_5;
    int[] arr_3_2 = new int[39];


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_3_2);

        exit_button6 = findViewById(R.id.exit_button_3_2);
        exit_button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_2.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });

        third_2_1= findViewById(R.id.third_2_1);
        third_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_2.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });
        third_2_2 = findViewById(R.id.third_2_2);
        third_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_2.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });
        third_2_3 = findViewById(R.id.third_2_3);
        third_2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_2.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });

        third_2_4 = findViewById(R.id.third_2_4);
        third_2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_2.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });
        third_2_5= findViewById(R.id.third_2_5);
        third_2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_2.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });

    }
}