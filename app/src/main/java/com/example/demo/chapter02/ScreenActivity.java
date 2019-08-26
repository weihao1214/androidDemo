package com.example.demo.chapter02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.demo.R;
import com.example.demo.utils.DisplayUtil;

public class ScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        TextView tv_screen = findViewById(R.id.tv_screen);
        tv_screen.setText("当前屏幕的宽度是" + DisplayUtil.getScreenWidth(this) + "px,高度是" + DisplayUtil.getScreenHeight(this) + "px,像素密度是" + DisplayUtil.getScreenDensity(this));
    }
}
