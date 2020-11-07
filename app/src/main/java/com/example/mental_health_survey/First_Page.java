package com.example.mental_health_survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mental_health_survey.R;

import java.nio.file.FileStore;

public class First_Page extends AppCompatActivity {

    Button btn_next;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);

        btn_next = findViewById(R.id.next_btn1);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First_Page.this,Information_Gathering.class);
                startActivity(intent);
            }
        });






    }
}