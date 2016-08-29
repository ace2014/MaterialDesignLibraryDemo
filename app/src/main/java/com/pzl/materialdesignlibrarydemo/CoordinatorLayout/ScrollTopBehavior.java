package com.pzl.materialdesignlibrarydemo.CoordinatorLayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/**
 * @author zl.peng
 * @version [1.0, 2016-08-26]
 */
public class ScrollTopBehavior extends CoordinatorLayout.Behavior<View> {
    public static final String TAG = "ScrollTopBehavior";

    private ValueAnimator animatorShow;
    private ValueAnimator animatorHide;
    private int height;
    private boolean isShow;
    private final int showAnimEndFlag = 1;
    private final int hideAnimEndFlag = 2;
    private int endFlag = hideAnimEndFlag;

    public ScrollTopBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, final View child, View directTargetChild, View target, int nestedScrollAxes) {
        Log.d(TAG, "child.getHeight()=" + child.getHeight());

        height = child.getHeight();
        animatorShow = ValueAnimator.ofInt(0, height);
        animatorShow.setDuration(500);
        animatorShow.setInterpolator(new DecelerateInterpolator());
        animatorShow.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int v = (int) animation.getAnimatedValue();
                child.setBottom(v);
                child.setTop(v - height);
            }
        });

        animatorHide = ValueAnimator.ofInt(0, height);
        animatorHide.setDuration(800);
        animatorHide.setInterpolator(new AccelerateInterpolator());
        animatorHide.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int v = (int) animation.getAnimatedValue();
                child.setTop(-v);
                child.setBottom(-v + height);
            }
        });
        animatorHide.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                endFlag = hideAnimEndFlag;
            }
        });
        animatorShow.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                endFlag = showAnimEndFlag;
            }
        });
        return true;
    }


    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {

        if (dyUnconsumed < 0 || dyConsumed < 0) {
            if (isShow || endFlag != hideAnimEndFlag) return;
            animatorShow.start();
            isShow = true;
        }


        if (dyConsumed > 0 || dyUnconsumed > 0) {
            if (!isShow || endFlag != showAnimEndFlag) return;
            animatorHide.start();
            isShow = false;
        }

    }

}
