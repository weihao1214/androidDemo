package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.demo.chapter01.Chapter01Activity;
import com.example.demo.chapter02.Chapter02Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_chapter01 = findViewById(R.id.btn_chapter01);
        btn_chapter01.setOnClickListener(this);
        Button btn_chapter02 = findViewById(R.id.btn_chapter02);
        btn_chapter02.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_chapter01: {
                Intent intent = new Intent(this, Chapter01Activity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_chapter02: {
                Intent intent = new Intent(this, Chapter02Activity.class);
                startActivity(intent);
            }
        }
    }
}
