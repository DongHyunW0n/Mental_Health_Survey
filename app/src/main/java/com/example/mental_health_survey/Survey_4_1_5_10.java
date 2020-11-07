package com.example.mental_health_survey;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Survey_4_1_5_10 extends AppCompatActivity {

    Button exit_button_4_1;
    Button fourth_4_1_5_10_1;
    Button fourth_4_1_5_10_2;
    Button fourth_4_1_5_10_3;
    Button fourth_4_1_5_10_4;
    Button submit_4_1_5_10;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_4_1_5_10);

        exit_button_4_1 = findViewById(R.id.exit_button_4_1_5_10);
        exit_button_4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_4_1_5_10.this,Survey_Select_4.class);
                startActivity(intent);
            }
        });
        fourth_4_1_5_10_1 = (Button)findViewById(R.id.fourth_1_5_1_10_1) ;
        fourth_4_1_5_10_1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    fourth_4_1_5_10_1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    fourth_4_1_5_10_1.setBackgroundColor(Color.parseColor("#0088FF"));
                }

                return false;
            }
        });
        fourth_4_1_5_10_2 = (Button)findViewById(R.id.fourth_1_5_1_10_2) ;
        fourth_4_1_5_10_2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    fourth_4_1_5_10_2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    fourth_4_1_5_10_2.setBackgroundColor(Color.parseColor("#0088FF"));
                }

                return false;
            }
        });
        fourth_4_1_5_10_3 = (Button)findViewById(R.id.fourth_1_5_1_10_3) ;
        fourth_4_1_5_10_3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    fourth_4_1_5_10_3.setBackgroundColor(Color.parseColor("#FFFFFF"));
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    fourth_4_1_5_10_3.setBackgroundColor(Color.parseColor("#0088FF"));
                }

                return false;
            }
        });
        fourth_4_1_5_10_4 = (Button)findViewById(R.id.fourth_1_5_1_10_4) ;
        fourth_4_1_5_10_4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    fourth_4_1_5_10_4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    fourth_4_1_5_10_4.setBackgroundColor(Color.parseColor("#0088FF"));
                }

                return false;
            }
        });




        submit_4_1_5_10 = findViewById(R.id.survey_4_1_5_10_submit);
        submit_4_1_5_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Survey_4_1_5_10.this,Survey_4_1_6.class);
                startActivity(intent);
            }
        });




    }
}