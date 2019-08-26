package com.example.demo.chapter02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.DateUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.demo.R;
import com.example.demo.utils.DateUtil;

public class BbsActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    private TextView tv_control;
    private TextView tv_bbs;
    private String[] mChatStr = {"你吃饭了吗？", "今天天气真好呀。",
            "我中奖啦！", "我们去看电影吧", "晚上干什么好呢？",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbs);
        this.tv_control = findViewById(R.id.tv_control);
        this.tv_control.setOnClickListener(this);
        this.tv_control.setOnLongClickListener(this);

        this.tv_bbs = findViewById(R.id.tv_bbs);
        this.tv_bbs.setOnClickListener(this);
        this.tv_bbs.setOnLongClickListener(this);
        this.tv_bbs.setGravity(Gravity.LEFT | Gravity.BOTTOM);
        this.tv_bbs.setLines(8);
        this.tv_bbs.setMaxLines(8);
        this.tv_bbs.setMovementMethod(new ScrollingMovementMethod());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_control || v.getId() == R.id.tv_bbs) {
            int random = (int)(Math.random()*10) % 5;
            String newStr = String.format("%s\n%s %s",
                    tv_bbs.getText().toString(), DateUtil.getNowTime(), mChatStr[random]);
            tv_bbs.setText(newStr);
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (v.getId() == R.id.tv_control || v.getId() == R.id.tv_bbs) {
            tv_bbs.setText("");
        }
        return true;
    }
}
