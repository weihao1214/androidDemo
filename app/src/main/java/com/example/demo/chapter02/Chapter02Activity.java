package com.example.demo.chapter02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.demo.R;

public class Chapter02Activity extends AppCompatActivity implements View.OnClickListener {

    private Intent intent;

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
        Button btn_margin = findViewById(R.id.btn_margin);
        btn_margin.setOnClickListener(this);
        Button btn_gravity = findViewById(R.id.btn_gravity);
        btn_gravity.setOnClickListener(this);
        Button btn_scroll = findViewById(R.id.btn_scroll);
        btn_scroll.setOnClickListener(this);
        Button btn_marquee = findViewById(R.id.btn_marquee);
        btn_marquee.setOnClickListener(this);
        Button btn_bbs = findViewById(R.id.btn_bbs);
        btn_bbs.setOnClickListener(this);
        Button btn_click = findViewById(R.id.btn_click);
        btn_click.setOnClickListener(this);
        Button btn_scale = findViewById(R.id.btn_scale);
        btn_scale.setOnClickListener(this);
        Button btn_capture = findViewById(R.id.btn_capture);
        btn_capture.setOnClickListener(this);
        Button btn_icon = findViewById(R.id.btn_icon);
        btn_icon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_px: {
                Intent intent = new Intent(this, PxActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_color: {
                Intent intent = new Intent(this, ColorActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_screen: {
                Intent intent = new Intent(this, ScreenActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_margin: {
                Intent intent = new Intent(this, MarginActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_gravity: {
                Intent intent = new Intent(this, GravityActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_scroll: {
                Intent intent = new Intent(this, ScrollActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_marquee: {
                Intent intent = new Intent(this, MarqueeActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_bbs: {
                Intent intent = new Intent(this, BbsActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_click: {
                Intent intent = new Intent(this, ClickActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_scale: {
                Intent intent = new Intent(this, ScaleActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_capture: {
                Intent intent = new Intent(this, CaptureActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.btn_icon: {
                Intent intent = new Intent(this, IconActivity.class);
                startActivity(intent);
            }
            break;
        }
    }
}
