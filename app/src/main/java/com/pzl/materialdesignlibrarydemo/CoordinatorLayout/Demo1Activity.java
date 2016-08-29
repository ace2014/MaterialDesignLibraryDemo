package com.pzl.materialdesignlibrarydemo.CoordinatorLayout;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.CycleInterpolator;

import com.pzl.materialdesignlibrarydemo.R;


public class Demo1Activity extends AppCompatActivity {
    private View view01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);
        initView();
    }

    private void initView() {
        view01 = findViewById(R.id.view01);
        ValueAnimator animator = ValueAnimator.ofFloat(0, 700f);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                view01.setY((Float) animation.getAnimatedValue());
            }
        });
        animator.setRepeatCount(Integer.MAX_VALUE);
        animator.setInterpolator(new CycleInterpolator(1f));
        animator.setDuration(6000);
        animator.start();
    }


}
