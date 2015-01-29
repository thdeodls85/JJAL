package com.finger.jjal.login;

import android.os.Bundle;
import android.view.MenuItem;

import com.finger.jjal.ParentActivity;
import com.finger.jjal.R;

/**
 * Created by songseunghyeon on 15. 1. 27..
 * <p/>
 * 이용약관
 */
public class AccessTermActivity extends ParentActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_access_term);
        initView();
    }

    private void initView()
    {
        // title
        getSupportActionBar().setTitle(R.string.access_term_title);

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
