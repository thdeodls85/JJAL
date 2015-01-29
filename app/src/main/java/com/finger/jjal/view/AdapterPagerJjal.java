package com.finger.jjal.view;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.finger.jjal.R;

import java.util.ArrayList;

/**
 * Created by songseunghyeon on 15. 1. 28..
 *
 * image swip adapter
 */
public class AdapterPagerJjal extends PagerAdapter
{
    private final Context mContext;
    private ArrayList<Integer> mArrayImage;

    public AdapterPagerJjal(Context context)
    {
        mContext = context;
    }

    public void setData(ArrayList<Integer> arrayImage)
    {
         mArrayImage =  arrayImage;
        // TODO page data 나중에는 객체로 드러오게 한다.. 지금은 이미지만 가지고 하고
    }

    @Override
    public int getCount()
    {
        if(mArrayImage != null)
        {
            int size = mArrayImage.size();
            if (size > 0)
            {
                return size;
            }
        }

        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return view.equals(object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        container.removeView((View)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
        // TODO 리스트 뷰로 바꾸자. 위,아래 기능 추가 필요
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_pager_jjal, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.adapter_pager_jjal_image);
        imageView.setImageResource(mArrayImage.get(position));

        container.addView(view);

        return view;
    }
}
