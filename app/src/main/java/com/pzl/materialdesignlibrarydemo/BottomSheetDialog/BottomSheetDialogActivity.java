package com.pzl.materialdesignlibrarydemo.BottomSheetDialog;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListView;

import com.pzl.materialdesignlibrarydemo.R;

public class BottomSheetDialogActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet_dialog);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initView();
    }

    private void initView() {

    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                listviewcontent();
                break;
            case R.id.btn2:
                gridviewcontent();
                break;
            case R.id.btn3:
                customcontent();
                break;
        }

    }

    private void listviewcontent() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        ListView listView = new ListView(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1);
        for (int i = 0; i <= 6; i++) {
            adapter.add(String.valueOf((char) (i + 97)));
        }
        listView.setAdapter(adapter);
        bottomSheetDialog.setContentView(listView);
        bottomSheetDialog.show();
    }

    private void gridviewcontent() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        GridView gridView = new GridView(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1);
        for (int i = 0; i <= 12; i++) {
            adapter.add(String.valueOf((char) (i + 97)));
        }
        gridView.setAdapter(adapter);
        //gridView.setColumnWidth(120);
        gridView.setNumColumns(3);
        bottomSheetDialog.setContentView(gridView);
        bottomSheetDialog.show();
    }

    private void customcontent() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.layout_bottomsheetdialog);
        bottomSheetDialog.show();
    }

}
