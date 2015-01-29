package com.finger.jjal.login;

import android.os.Bundle;

import com.finger.jjal.ParentActivity;
import com.finger.jjal.R;

/**
 * Created by songseunghyeon on 15. 1. 27..
 * <p/>
 * loading
 */
public class LoginActivity extends ParentActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_loading);
        initView();
    }

    private void initView()
    {
        // title
        getSupportActionBar().setTitle(R.string.login_title);
    }
}
