package com.example.demo.chapter02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.demo.R;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        TextView tv_code_six = findViewById(R.id.tv_code_six);
        tv_code_six.setBackgroundColor(0x00ff00);
        TextView tv_code_eight = findViewById(R.id.tv_code_eight);
        tv_code_eight.setBackgroundColor(0xff00ff00);
    }
}
