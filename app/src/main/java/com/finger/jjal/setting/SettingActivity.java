package com.finger.jjal.setting;

import android.os.Bundle;

import com.finger.jjal.ParentActivity;
import com.finger.jjal.R;

/**
 * Created by songseunghyeon on 15. 1. 27..
 * <p/>
 * setting
 */
public class SettingActivity extends ParentActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_setting);
        initView();
    }

    private void initView()
    {

    }
}
