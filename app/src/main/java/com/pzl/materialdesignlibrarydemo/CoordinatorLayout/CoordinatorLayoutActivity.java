package com.pzl.materialdesignlibrarydemo.CoordinatorLayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.pzl.materialdesignlibrarydemo.R;

public class CoordinatorLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void click(View v) {
        Intent i = new Intent();
        switch (v.getId()) {
            case R.id.btn1:
                i.setClass(this, Demo1Activity.class);
                break;
            case R.id.btn2:
                i.setClass(this, Demo2Activity.class);
                break;
            case R.id.btn3:
                i.setClass(this, Demo3Activity.class);
                break;
        }
        startActivity(i);
    }

}
