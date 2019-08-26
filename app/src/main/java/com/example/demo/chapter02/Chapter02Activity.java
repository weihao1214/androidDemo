package com.example.demo.chapter02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.demo.R;

public class Chapter02Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter02);
        Button btn_px = findViewById(R.id.btn_px);
        btn_px.setOnClickListener(this);
        Button btn_color = findViewById(R.id.btn_color);
        btn_color.setOnClickListener(this);
        Button btn_screen = findViewById(R.id.btn_screen);
        btn_screen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_px:
            {
                Intent intent = new Intent(this,PxActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_color:
            {
                Intent intent = new Intent(this,ColorActivity.class);
                startActivity(intent);
            }
            break;
            case  R.id.btn_screen:
            {
                Intent intent = new Intent(this,ScreenActivity.class);
                startActivity(intent);
            }
            break;
        }
    }
}
