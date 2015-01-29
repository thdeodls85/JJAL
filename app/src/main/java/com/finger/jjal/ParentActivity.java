package com.finger.jjal;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by songseunghyeon on 15. 1. 27..
 * <p/>
 * 부모 class -> 각 Activity의 공통 모듈을 뺀다.
 */
public class ParentActivity extends ActionBarActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // TODO 광고 모든곳에 탑재 함으로 공통 모듈로 빼고, hide 가능하게 해주는 로직 추가하자.

        initView();
    }

    private void initView()
    {
        setAd();
    }

    /**
     * 광고 로직 넣어준다.
     */
    private void setAd()
    {

    }
}
