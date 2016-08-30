package com.pzl.materialdesignlibrarydemo.TabLayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pzl.materialdesignlibrarydemo.R;

/**
 * @author zl.peng
 * @version [1.0, 2016-08-30]
 */
public class PageFragment extends Fragment {
    public String title;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_page, container, false);
        TextView tv = (TextView) v.findViewById(R.id.tv);
        tv.setText(title == null ? "" : title);
        return v;
    }

    public static PageFragment newInstance() {
        return new PageFragment();
    }
}
