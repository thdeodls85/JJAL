package com.finger.jjal.main;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.finger.jjal.ParentActivity;
import com.finger.jjal.R;


public class MainActivity extends ParentActivity
{
    private boolean mIsFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView()
    {

    }

    @Override
    public void onBackPressed()
    {
        // TODO 3초 안에 두번 클릭 하면 바로 나갈 수 있게
        final long delaySecond = 2000;
        if (mIsFinish)
        {
            finish();
        } else
        {
            mIsFinish = true;
            Toast.makeText(MainActivity.this, R.string.main_finish_toast, Toast.LENGTH_LONG).show();

            new Handler().postDelayed(new Runnable()
            {
                @Override
                public void run()
                {
                    mIsFinish = false;
                }
            }, delaySecond);
        }
    }
}
