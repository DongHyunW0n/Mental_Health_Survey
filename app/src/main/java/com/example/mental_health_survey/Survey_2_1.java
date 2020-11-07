package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_2_1 extends AppCompatActivity {

    Button exit_button3;
    Button second_1;
    Button second_2;
    Button second_3;
    Button second_4;
    int[] arr_2_1 = new int[20];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_2_1);

        exit_button3 = findViewById(R.id.exit_button_2_1);
        exit_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_2_1.this,Survey_Select_2.class);
                startActivity(intent);
            }
        });

        second_1 = findViewById(R.id.second_1_1);
        second_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_2_1.this,Survey_Select_2.class);
                startActivity(intent);
            }
        });
        second_2 = findViewById(R.id.second_1_2);
        second_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_2_1.this,Survey_Select_2.class);
                startActivity(intent);
            }
        });
        second_3 = findViewById(R.id.second_1_3);
        second_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_2_1.this,Survey_Select_2.class);
                startActivity(intent);
            }
        });

        second_4 = findViewById(R.id.second_1_4);
        second_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_2_1.this,Survey_Select_2.class);
                startActivity(intent);
            }
        });

    }
}
