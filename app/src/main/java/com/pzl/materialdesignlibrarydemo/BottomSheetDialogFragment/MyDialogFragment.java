package com.pzl.materialdesignlibrarydemo.BottomSheetDialogFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pzl.materialdesignlibrarydemo.R;

/**
 * @author zl.peng
 * @version [1.0, 2016-08-30]
 */
public class MyDialogFragment extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_dialogfragment, container, false);
        return view;
    }
}
