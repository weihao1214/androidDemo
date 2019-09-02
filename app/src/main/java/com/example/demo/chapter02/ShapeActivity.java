package com.example.demo.chapter02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.demo.R;

public class ShapeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);
        findViewById(R.id.btn_oval).setOnClickListener(this);
        findViewById(R.id.btn_rect).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_rect: {
                View v_content =  findViewById(R.id.v_content);
                v_content.setBackgroundResource(R.drawable.shape_rect_gold);
            }
            break;
            case R.id.btn_oval: {
                View v_content = findViewById(R.id.v_content);
                v_content.setBackgroundResource(R.drawable.shape_oval_rose);
            }
            break;
        }
    }
}
