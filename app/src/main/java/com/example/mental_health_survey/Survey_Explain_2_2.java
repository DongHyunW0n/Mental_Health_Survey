package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_Explain_2_2 extends AppCompatActivity {
    Button next_button6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_explain_2_2);

        next_button6 = findViewById(R.id.next_btn6);
        next_button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Explain_2_2.this,Survey_2_2.class);
                startActivity(intent);

            }


        });
    }
}
