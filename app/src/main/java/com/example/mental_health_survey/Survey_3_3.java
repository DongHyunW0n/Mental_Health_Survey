package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_3_3 extends AppCompatActivity {

    Button exit_button_3_3;
    Button third_3_1;
    Button third_3_2;
    Button third_3_3;
    Button third_3_4;
    Button third_3_5;
    int[] arr_3_3 = new int[48];


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_3_3);

        exit_button_3_3 = findViewById(R.id.exit_button_3_3);
        exit_button_3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_3.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });

        third_3_1= findViewById(R.id.third_3_1);
        third_3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_3.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });
        third_3_2 = findViewById(R.id.third_3_2);
        third_3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_3.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });
        third_3_3 = findViewById(R.id.third_3_3);
        third_3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_3.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });

        third_3_4 = findViewById(R.id.third_3_4);
        third_3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_3.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });
        third_3_5= findViewById(R.id.third_3_5);
        third_3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_3.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });

    }
}