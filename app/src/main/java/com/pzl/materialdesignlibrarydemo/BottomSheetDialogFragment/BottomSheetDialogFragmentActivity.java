package com.pzl.materialdesignlibrarydemo.BottomSheetDialogFragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;

import com.pzl.materialdesignlibrarydemo.R;

public class BottomSheetDialogFragmentActivity extends AppCompatActivity {
    private MyDialogFragment dialogFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet_dialog_fragment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        dialogFragment = new MyDialogFragment();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (!dialogFragment.isAdded())
            dialogFragment.show(getSupportFragmentManager(), "dialogFragment");
        return true;
    }
}
