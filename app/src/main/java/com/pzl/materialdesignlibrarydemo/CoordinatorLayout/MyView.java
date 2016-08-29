package com.pzl.materialdesignlibrarydemo.CoordinatorLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by zl.peng on 2016/8/27 16:21.
 */
public class MyView extends View {
    public static final String TAG = "MyView";
    private float mLastX;
    private float mLastY;

    private float mHeight;


    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mHeight = getMeasuredHeight();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        final float x = event.getX();
        final float y = event.getY();
        Log.d(TAG, "y=" + y);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                float dy = y - mLastY;
                float dx = x - mLastX;
               // Log.d(TAG, "dy=" + dy);
               /* if (getTop() + dy < 0) {
                    scrollTo(0, 0);
                    break;
                }*/
                //layout(getLeft(), getTop() + (int) dy, getRight(), getBottom() + (int) dy);
                offsetTopAndBottom((int)dy);
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        mLastX = x;
        mLastY = y;
        return true;
    }
}
