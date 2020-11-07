package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_Explain_3_3 extends AppCompatActivity {
    Button next_button9;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_explain_3_3);

        next_button9 = findViewById(R.id.next_btn9);
        next_button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Explain_3_3.this,Survey_3_3.class);
                startActivity(intent);

            }


        });
    }
}
