package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_Explain_3_4 extends AppCompatActivity {
    Button next_button10;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_explain_3_4);

        next_button10 = findViewById(R.id.next_btn10);
        next_button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_Explain_3_4.this,Survey_3_4.class);
                startActivity(intent);

            }


        });
    }
}
