package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_4_1_1 extends AppCompatActivity {

    Button exit_button_4_1;
    Button submit_4_1_1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_4_1_1);

        exit_button_4_1 = findViewById(R.id.exit_button_4_1_1);
        exit_button_4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_4_1_1.this, Survey_Select_4.class);
                startActivity(intent);
            }
        });
        submit_4_1_1 = findViewById(R.id.survey_4_1_1_submit);
        submit_4_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_4_1_1.this, Survey_4_1_2.class);
                startActivity(intent);
            }
        });

    }
}
