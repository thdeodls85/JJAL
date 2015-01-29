package com.finger.jjal.jjal;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.finger.jjal.ParentActivity;
import com.finger.jjal.R;
import com.finger.jjal.view.AdapterPagerJjal;

import java.util.ArrayList;

/**
 * Created by songseunghyeon on 15. 1. 28..
 */
public class JjalActivity extends ParentActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jjal);
        initView();
    }

    private void initView()
    {
        ViewPager viewPager = (ViewPager) findViewById(R.id.jjal_pagerview);

        final int pageLimit = 3;
        viewPager.setOffscreenPageLimit(pageLimit);

        ArrayList<Integer> arrayImage = new ArrayList<Integer>();
        arrayImage.add(R.drawable.ic_launcher);
        arrayImage.add(R.drawable.ic_launcher);
        arrayImage.add(R.drawable.ic_launcher);
        arrayImage.add(R.drawable.ic_launcher);
        arrayImage.add(R.drawable.ic_launcher);
        arrayImage.add(R.drawable.ic_launcher);

        AdapterPagerJjal adapterPager = new AdapterPagerJjal(this);
        adapterPager.setData(arrayImage);
        viewPager.setAdapter(adapterPager);
    }
}
