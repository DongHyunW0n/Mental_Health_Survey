package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_3_1 extends AppCompatActivity {

    Button exit_button5;
    Button third_1;
    Button third_2;
    Button third_3;
    Button third_4;
    Button third_5;
    Button third_6;
    int[] arr_3_1 = new int[10];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_3_1);

        exit_button5 = findViewById(R.id.exit_button_3_1);
        exit_button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_1.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });

        third_1= findViewById(R.id.third_1_1);
        third_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_1.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });
        third_2 = findViewById(R.id.third_1_2);
        third_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_1.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });
        third_3 = findViewById(R.id.third_1_3);
        third_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_1.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });

        third_4 = findViewById(R.id.third_1_4);
        third_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_1.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });
        third_5= findViewById(R.id.third_1_5);
        third_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_1.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });
        third_6= findViewById(R.id.third_1_6);
        third_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_3_1.this,Survey_Select_3.class);
                startActivity(intent);
            }
        });

    }
}
