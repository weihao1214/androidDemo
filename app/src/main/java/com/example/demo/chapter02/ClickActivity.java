package com.example.demo.chapter02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demo.R;

import org.w3c.dom.Text;

public class ClickActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
        Button btn_click = findViewById(R.id.btn_click);
        btn_click.setOnClickListener(this);
        btn_click.setOnLongClickListener(new MyOnLongClickListener());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_click) {
            Toast.makeText(this, "您点击了控件" + ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
        }
    }

    class MyOnLongClickListener implements View.OnLongClickListener {
        @Override
        public boolean onLongClick(View v) {
            Toast.makeText(ClickActivity.this, "您长按了控件" + ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            return true;
        }
    }
}
