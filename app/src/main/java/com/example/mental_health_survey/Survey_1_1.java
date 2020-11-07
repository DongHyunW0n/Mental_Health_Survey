package com.example.mental_health_survey;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class Survey_1_1 extends AppCompatActivity {


    int count = 0;
    int[] arr_1_1 = new int[9];
    Button exit_button1;
    Button first_1;
    Button first_2;
    Button first_3;
    Button first_4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_1_1);

        exit_button1 = findViewById(R.id.exit_button_1_1);
        exit_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Survey_1_1.this, Survey_Select_1.class);
                startActivity(intent);
            }



        });


        first_1 = findViewById(R.id.first_1_1);
        first_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count<8){
                    arr_1_1[count]=1;
                    Log.d("result_1_1", Arrays.toString(arr_1_1));
                    count++;
                }else {
                    arr_1_1[count]=1;
                    Log.d("result_1_1", Arrays.toString(arr_1_1));
                    Intent intent = new Intent(Survey_1_1.this, Survey_1_2.class);
                    startActivity(intent);

                }
            }
        });




        first_2 = findViewById(R.id.first_1_2);
        first_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count < 8) {
                    arr_1_1[count]=2;
                    Log.d("result_1_1", Arrays.toString(arr_1_1));
                    count++;
                }else {
                    arr_1_1[count]=2;
                    Log.d("result_1_1", Arrays.toString(arr_1_1));
                    Intent intent = new Intent(Survey_1_1.this, Survey_1_2.class);
                    startActivity(intent);
                }
            }
        });
        first_3 = findViewById(R.id.first_1_3);
        first_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count < 8) {
                    arr_1_1[count] = 3;
                    Log.d("result_1_1", Arrays.toString(arr_1_1));
                    count++;
                }else {
                    arr_1_1[count] = 3;
                    Log.d("result_1_1", Arrays.toString(arr_1_1));
                    Intent intent = new Intent(Survey_1_1.this, Survey_1_2.class);
                    startActivity(intent);
                }
            }
        });

        first_4 = findViewById(R.id.first_1_4);
        first_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count < 8) {
                    arr_1_1[count] = 4;
                    Log.d("result_1_1", Arrays.toString(arr_1_1));
                    count++;
                }else {
                    arr_1_1[count] = 4;
                    Log.d("result_1_1", Arrays.toString(arr_1_1));
                    Intent intent = new Intent(Survey_1_1.this, Survey_1_2.class);
                    startActivity(intent);
                }
            }
        });





    }
}
