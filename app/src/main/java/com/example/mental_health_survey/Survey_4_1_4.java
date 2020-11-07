package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_4_1_4 extends AppCompatActivity {

    Button exit_button_4_1;
    Button submit_4_1_4;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_4_1_4);

        exit_button_4_1 = findViewById(R.id.exit_button_4_1_4);
        exit_button_4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_4_1_4.this, Survey_Select_4.class);
                startActivity(intent);
            }
        });
        submit_4_1_4 = findViewById(R.id.survey_4_1_4_submit);
        submit_4_1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_4_1_4.this, Survey_4_1_5_1.class);
                startActivity(intent);
            }
        });

    }
}
