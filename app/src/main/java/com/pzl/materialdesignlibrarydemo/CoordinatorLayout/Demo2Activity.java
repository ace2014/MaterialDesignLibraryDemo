package com.pzl.materialdesignlibrarydemo.CoordinatorLayout;

import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;

import com.pzl.materialdesignlibrarydemo.R;


public class Demo2Activity extends AppCompatActivity {
    private NestedScrollView nsv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);
        initView();
    }

    private void initView() {
        // nsv = (NestedScrollView) findViewById(R.id.nsv);

    }
}
