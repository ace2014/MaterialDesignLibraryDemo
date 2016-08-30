package com.pzl.materialdesignlibrarydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.pzl.materialdesignlibrarydemo.AppBarLayout.AppBarLayoutActivity;
import com.pzl.materialdesignlibrarydemo.BottomSheetDialog.BottomSheetDialogActivity;
import com.pzl.materialdesignlibrarydemo.BottomSheetDialogFragment.BottomSheetDialogFragmentActivity;
import com.pzl.materialdesignlibrarydemo.CollapsingToolbarLayout.CollapsingToolbarLayoutActivity;
import com.pzl.materialdesignlibrarydemo.CoordinatorLayout.CoordinatorLayoutActivity;
import com.pzl.materialdesignlibrarydemo.Snackbar.SnackbarActivity;
import com.pzl.materialdesignlibrarydemo.TabLayout.TabLayoutActivity;
import com.pzl.materialdesignlibrarydemo.TextInputEditText.TextInputEditTextActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("MaterialDesignLibrary");
    }

    public void click(View v) {
        Intent i = new Intent();
        switch (v.getId()) {
            case R.id.AppBarLayout:
                i.setClass(this, AppBarLayoutActivity.class);
                break;
            case R.id.CollapsingToolbarLayout:
                i.setClass(this, CollapsingToolbarLayoutActivity.class);
                break;
            case R.id.CoordinatorLayout:
                i.setClass(this, CoordinatorLayoutActivity.class);
                break;
            case R.id.BottomSheetDialog:
                i.setClass(this, BottomSheetDialogActivity.class);
                break;
            case R.id.BottomSheetDialogFragment:
                i.setClass(this, BottomSheetDialogFragmentActivity.class);
                break;
            case R.id.Snackbar:
                i.setClass(this, SnackbarActivity.class);
                break;
            case R.id.TabLayout:
                i.setClass(this, TabLayoutActivity.class);
                break;
            case R.id.TextInputEditText:
                i.setClass(this, TextInputEditTextActivity.class);
                break;
        }
        startActivity(i);
    }
}
