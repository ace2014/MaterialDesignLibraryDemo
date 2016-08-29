package com.pzl.materialdesignlibrarydemo.CollapsingToolbarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pzl.materialdesignlibrarydemo.R;

public class CollapsingToolbarLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_layout);

    }

    public void click(View view) {
        Intent i = new Intent();
        switch (view.getId()) {
            case R.id.btn1:
                i.setClass(this, ContentScrimActivity.class);
                break;
        }
        startActivity(i);
    }

}
