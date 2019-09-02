package com.example.demo.chapter02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demo.R;
import com.example.demo.utils.DateUtil;

public class CaptureActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView tv_capture;
    public ImageView iv_capture;
    private String[] mChatStr = {"你吃饭了吗？", "今天天气真好呀。",
            "我中奖啦！", "我们去看电影吧。", "晚上干什么好呢？"};
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);
        this.tv_capture = findViewById(R.id.tv_capture);
        this.iv_capture = findViewById(R.id.iv_capture);
        Button btn_chat = findViewById(R.id.btn_chat);
        Button btn_capture = findViewById(R.id.btn_capture);
        btn_chat.setOnClickListener(this);
        btn_chat.setOnLongClickListener(new MyOnLongClickListener());
        btn_capture.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_chat) {
            int random = (int) (Math.random() * 10) % 5;
            String newStr = String.format("%s\n%s %s", this.tv_capture.getText().toString(), DateUtil.getNowTime(), mChatStr[random]);
            tv_capture.setText(newStr);
        } else if (v.getId() == R.id.btn_capture) {
            Bitmap bitmap = this.tv_capture.getDrawingCache();
            this.iv_capture.setImageBitmap(bitmap);
            mHandler.postDelayed(mResetCache, 200);
        }
    }

    class MyOnLongClickListener implements View.OnLongClickListener {
        @Override
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.btn_chat) {
                tv_capture.setText("");
            }
            return true;
        }
    }

    private Runnable mResetCache = new Runnable() {
        @Override
        public void run() {
            tv_capture.setDrawingCacheEnabled(false);
            tv_capture.setDrawingCacheEnabled(true);
        }
    };
}
