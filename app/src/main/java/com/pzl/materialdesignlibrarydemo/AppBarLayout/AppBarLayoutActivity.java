package com.pzl.materialdesignlibrarydemo.AppBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pzl.materialdesignlibrarydemo.R;

public class AppBarLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_layout);
    }

    public void click(View v) {
        Intent i = new Intent();
        switch (v.getId()) {
            case R.id.btn1:
                i.setClass(this, ScrollActivity.class);
                break;
            case R.id.btn2:
                i.setClass(this, EnterAlwaysActivity.class);
                break;
            case R.id.btn3:
                i.setClass(this, CombineActivity.class);
                break;
            case R.id.btn4:
                i.setClass(this, EnterAlwaysCollapsedActivity.class);
                break;
            case R.id.btn5:
                i.setClass(this, ExitUntilCollapsedActivity.class);
                break;
            case R.id.btn6:
                i.setClass(this, SnapActivity.class);
                break;
        }
        startActivity(i);
    }
}
