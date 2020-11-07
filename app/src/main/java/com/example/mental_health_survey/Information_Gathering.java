package com.example.mental_health_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Information_Gathering extends AppCompatActivity {

    Button next_button2;
    EditText Input_Name;
    EditText Input_Age;
    EditText Input_Sex;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_gathering);


        next_button2 = findViewById(R.id.next_btn2);

        next_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Information_Gathering.this, Survey_Select.class);
                startActivity(intent);
            }
        });
    }
}
