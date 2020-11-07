package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_Explain_3_2 extends AppCompatActivity {
    Button next_button8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_explain_3_2);

        next_button8 = findViewById(R.id.next_btn8);
        next_button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Explain_3_2.this,Survey_3_2.class);
                startActivity(intent);

            }


        });
    }
}
