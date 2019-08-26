package com.example.demo.chapter02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.demo.R;

public class MarqueeActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean bPause = false;
    private TextView tv_marquee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marquee);
        tv_marquee = (TextView) findViewById(R.id.tv_marquee);
        tv_marquee.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_marquee) {
            this.bPause = !this.bPause;
            this.tv_marquee.setFocusable(!this.bPause);
            this.tv_marquee.setFocusableInTouchMode(!this.bPause);
        }
    }
}
