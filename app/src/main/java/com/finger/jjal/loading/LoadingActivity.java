package com.finger.jjal.loading;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;

import com.finger.jjal.ParentActivity;
import com.finger.jjal.R;
import com.finger.jjal.jjal.JjalActivity;
import com.finger.jjal.jjal.JjalListActivity;
import com.finger.jjal.jjal.TodayJjalActivity;
import com.finger.jjal.login.LoginActivity;
import com.finger.jjal.main.MainActivity;

/**
 * Created by songseunghyeon on 2015. 1. 26..
 * <p/>
 * 로딩
 */
public class LoadingActivity extends ParentActivity
{
    private final int mMainActivityIndex = 0;
    private final int mLoadingActivityIndex = 1;
    private final int mTodayJjalActivityIndex = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_loading);
        initView();
    }

    private void initView()
    {
        checkID();
        loadingDelayActivity(mLoadingActivityIndex);
    }

    /**
     * ID 있는지 없는지 체크한다.
     */
    private void checkID()
    {
        // TODO id 저장한거 불러오는 로직 필요
        String checkID = "id";

        if (!TextUtils.isEmpty(checkID))
        {
            checkTodayContact();
        }
        else
        {
            loadingDelayActivity(mLoadingActivityIndex);
        }
    }

    /**
     * 3초 로딩 후, 다음페이지로 이동
     */
    private void loadingDelayActivity(final int activityIndex)
    {
        // 3 second
        final long delaySecond = 3000;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {

                Intent intent = new Intent(LoadingActivity.this, JjalListActivity.class);
                startActivity(intent);

//                switch (activityIndex)
//                {
//                    case mLoadingActivityIndex:
//                        goLoginActivity();
//                        break;
//                    case mMainActivityIndex:
//                        goMainActivity();
//                        break;
//                    case mTodayJjalActivityIndex:
//                        goTodayJjalActivity();
//                        break;
//                }
            }
        }, delaySecond);
    }

    /**
     * 금일 접속 여부 판단
     */
    private void checkTodayContact()
    {
        boolean todayContacted = false;

        if (todayContacted)
        {
            loadingDelayActivity(mMainActivityIndex);
        }
        else
        {
            loadingDelayActivity(mTodayJjalActivityIndex);
        }
    }

    private void goTodayJjalActivity()
    {
        Intent intent = new Intent(this, TodayJjalActivity.class);
        startActivity(intent);
    }

    private void goLoginActivity()
    {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    private void goMainActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
