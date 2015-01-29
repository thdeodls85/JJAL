package com.finger.jjal.login;

import android.os.Bundle;
import android.view.MenuItem;

import com.finger.jjal.ParentActivity;
import com.finger.jjal.R;

/**
 * Created by songseunghyeon on 15. 1. 27..
 * <p/>
 * 개인정보 취급방침침
 */
public class PrivacyActivity extends ParentActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_privacy);
        initView();
    }

    private void initView()
    {
        // title
        getSupportActionBar().setTitle(R.string.privacy_title);

        // possible visible back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // back
        finish();
        return super.onOptionsItemSelected(item);
    }
}
