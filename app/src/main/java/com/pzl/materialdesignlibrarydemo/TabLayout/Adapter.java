package com.pzl.materialdesignlibrarydemo.TabLayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * @author zl.peng
 * @version [1.0, 2016-08-30]
 */
public class Adapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments;
    private String[] titles;

    public Adapter(FragmentManager fm, ArrayList<Fragment> fragments, String[] titles) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }

    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        PageFragment fragment = (PageFragment) fragments.get(position);
        fragment.title = titles[position];
        return fragment;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
