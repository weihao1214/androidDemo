package com.example.demo.chapter01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.example.demo.R;

public class Chapter01Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter01);
        TextView tv_hello = findViewById(R.id.tv_hello);
        tv_hello.setText("今天天气真热啊，火辣辣的!");
        tv_hello.setTextColor(Color.RED);
        tv_hello.setTextSize(30);

    }
}
