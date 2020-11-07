package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_4_1_5_1 extends AppCompatActivity {

    Button exit_button_4_1;
    Button fourth_4_1_5_1_1;
    Button fourth_4_1_5_1_2;
    Button fourth_4_1_5_1_3;
    Button fourth_4_1_5_1_4;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_4_1_5_1);

        exit_button_4_1 = findViewById(R.id.exit_button_4_1_5_1);
        exit_button_4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_4_1_5_1.this,Survey_Select_4.class);
                startActivity(intent);
            }
        });

        fourth_4_1_5_1_1= findViewById(R.id.fourth_1_5_1_1);
        fourth_4_1_5_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_4_1_5_1.this,Survey_4_1_5_10.class);
                startActivity(intent);
            }
        });
        fourth_4_1_5_1_2 = findViewById(R.id.fourth_1_5_1_2);
        fourth_4_1_5_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_4_1_5_1.this,Survey_4_1_5_10.class);
                startActivity(intent);
            }
        });
        fourth_4_1_5_1_3 = findViewById(R.id.fourth_1_5_1_3);
        fourth_4_1_5_1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_4_1_5_1.this,Survey_4_1_5_10.class);
                startActivity(intent);
            }
        });

        fourth_4_1_5_1_4 = findViewById(R.id.fourth_1_5_1_4);
        fourth_4_1_5_1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_4_1_5_1.this,Survey_4_1_5_10.class);
                startActivity(intent);
            }
        });


    }
}