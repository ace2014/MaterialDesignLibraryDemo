package com.pzl.materialdesignlibrarydemo.Snackbar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.pzl.materialdesignlibrarydemo.R;

public class SnackbarActivity extends AppCompatActivity {
    private static final String TAG = "SnackbarActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 *  snackbar会试着寻找一个父view来hold这个view. Snackbar将遍历整个view tree 来寻找一个合适的父view;
                 *  所以SnackBar.show()的时候,要注意先把Keyboard.hide()了.不然,键盘就会遮住SnackBar;
                 *  GC;
                 */
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.e(TAG, "Snackbar OnClickListener");
                            }
                        }).show();
            }
        });
    }

}
