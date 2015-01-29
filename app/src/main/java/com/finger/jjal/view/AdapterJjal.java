package com.finger.jjal.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.finger.jjal.R;
import com.finger.jjal.data.JjalData;

import java.util.ArrayList;

/**
 * Created by songseunghyeon on 15. 1. 28..
 * <p/>
 * jjal list adapter
 */
public class AdapterJjal extends BaseAdapter
{
    private final Context mContext;
    private Holder mHolder;
    private ArrayList<JjalData> arrayJjalData;
    private boolean mIsPossibleDelete;

    public AdapterJjal(Context context)
    {
        mContext = context;
    }

    public void setData(ArrayList<JjalData> arrayJjalData)
    {
        this.arrayJjalData = arrayJjalData;
    }

    public boolean isPossibleDelete()
    {
        return mIsPossibleDelete;
    }

    public void setIsPossibleDelete(boolean mIsPossibleDelete)
    {
        this.mIsPossibleDelete = mIsPossibleDelete;
    }

    @Override
    public int getCount()
    {
        if (arrayJjalData != null)
        {
            int size = arrayJjalData.size();
            if (size > 0)
            {
                return size;
            }
        }
        return 0;
    }

    @Override
    public JjalData getItem(int position)
    {
        if (arrayJjalData != null)
        {
            return arrayJjalData.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.adapter_jjal, null);

            mHolder = new Holder();
            mHolder.mTitle = (TextView) convertView.findViewById(R.id.adapter_jjal_title);
            mHolder.mDescription = (TextView) convertView.findViewById(R.id.adapter_jjal_title);

            convertView.setTag(mHolder);
        }
        else
        {
            mHolder = (Holder) convertView.getTag();
        }

        JjalData jjalData = arrayJjalData.get(position);
        if (jjalData != null)
        {
            //            mHolder.mTitle.setText(jjalData.getTitle());
            //            mHolder.mDescription.setText(jjalData.getDescription());

            // TODO delete 가능하게 해야
            if (mIsPossibleDelete)
            {

            }
            else
            {

            }
        }

        return convertView;
    }

    private class Holder
    {
        public TextView mTitle;
        public TextView mDescription;
    }
}
