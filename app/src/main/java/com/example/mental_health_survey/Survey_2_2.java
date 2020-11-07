package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_2_2 extends AppCompatActivity {

    Button exit_button4;
    Button second_5;
    Button second_6;
    Button second_7;
    Button second_8;
    int[] arr_2_2 = new int[20];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_2_2);

        exit_button4 = findViewById(R.id.exit_button_2_2);
        exit_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_2_2.this,Survey_Select_2.class);
                startActivity(intent);
            }
        });

        second_5= findViewById(R.id.second_2_1);
        second_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_2_2.this,Survey_Select_2.class);
                startActivity(intent);
            }
        });
        second_6 = findViewById(R.id.second_2_2);
        second_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_2_2.this,Survey_Select_2.class);
                startActivity(intent);
            }
        });
        second_7 = findViewById(R.id.second_2_3);
        second_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_2_2.this,Survey_Select_2.class);
                startActivity(intent);
            }
        });

        second_8 = findViewById(R.id.second_2_4);
        second_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_2_2.this,Survey_Select_2.class);
                startActivity(intent);
            }
        });

    }
}
