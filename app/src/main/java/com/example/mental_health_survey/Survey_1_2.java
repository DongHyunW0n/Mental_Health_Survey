package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_1_2 extends AppCompatActivity {

    int[] arr_1_2 = new int[1];

    Button exit_button2;
    Button first_5;
    Button first_6;
    Button first_7;
    Button first_8;
    Button first_9;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_1_2);

        exit_button2 = findViewById(R.id.exit_button_1_2);
        exit_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_1_2.this,Survey_Select_1.class);
                startActivity(intent);
            }
        });



        first_5 = findViewById(R.id.first_2_1);
        first_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_1_2.this,Result_1.class);
                startActivity(intent);
            }
        });
        first_6 = findViewById(R.id.first_2_2);
        first_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_1_2.this,Result_1.class);
                startActivity(intent);
            }
        });
        first_7 = findViewById(R.id.first_2_3);
        first_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_1_2.this,Result_1.class);
                startActivity(intent);
            }
        });

        first_8 = findViewById(R.id.first_2_4);
        first_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_1_2.this,Result_1.class);
                startActivity(intent);
            }
        });

        first_9 = findViewById(R.id.first_2_5);
        first_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_1_2.this,Result_1.class);
                startActivity(intent);
            }
        });




    }
}
