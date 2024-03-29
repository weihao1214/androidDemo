package com.example.demo.chapter02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.demo.R;

public class ScaleActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView iv_scale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        this.iv_scale = findViewById(R.id.iv_scale);
        findViewById(R.id.btn_fitCenter).setOnClickListener(this);
        findViewById(R.id.btn_centerCrop).setOnClickListener(this);
        findViewById(R.id.btn_centerInside).setOnClickListener(this);
        findViewById(R.id.btn_center).setOnClickListener(this);
        findViewById(R.id.btn_fitXY).setOnClickListener(this);
        findViewById(R.id.btn_fitStart).setOnClickListener(this);
        findViewById(R.id.btn_fitEnd).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_fitCenter: {
                iv_scale.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            break;
            case R.id.btn_centerCrop: {
                iv_scale.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            break;
            case R.id.btn_centerInside: {
                iv_scale.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            }
            break;
            case R.id.btn_center: {
                iv_scale.setScaleType(ImageView.ScaleType.CENTER);
            }
            break;
            case R.id.btn_fitXY: {
                iv_scale.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            break;
            case R.id.btn_fitStart: {
                iv_scale.setScaleType(ImageView.ScaleType.FIT_START);
            }
            break;
            case R.id.btn_fitEnd: {
                iv_scale.setScaleType(ImageView.ScaleType.FIT_END);
            }
            break;
        }
    }
}
