package com.example.demo.chapter02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.demo.R;
import com.example.demo.utils.Utils;

public class PxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_px);
        int dip_10 = Utils.dip2px(this,10f);
        TextView tv_padding = findViewById(R.id.tv_padding);
        tv_padding.setPadding(dip_10,dip_10,dip_10,dip_10);
    }
}
