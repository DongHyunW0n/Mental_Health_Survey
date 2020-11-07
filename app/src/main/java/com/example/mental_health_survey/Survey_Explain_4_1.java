package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_Explain_4_1 extends AppCompatActivity {
    Button next_button11;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_explain_4_1);

        next_button11 = findViewById(R.id.next_btn11);
        next_button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Explain_4_1.this, Survey_4_1_1.class);
                startActivity(intent);

            }


        });
    }
}
