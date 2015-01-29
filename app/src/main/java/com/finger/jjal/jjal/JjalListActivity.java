package com.finger.jjal.jjal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.finger.jjal.ParentActivity;
import com.finger.jjal.R;
import com.finger.jjal.data.JjalData;
import com.finger.jjal.view.AdapterJjal;

import java.util.ArrayList;

/**
 * Created by songseunghyeon on 15. 1. 28..
 */
public class JjalListActivity extends ParentActivity implements AdapterView.OnItemClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jjal_list);
        initView();
    }

    private void initView()
    {
        // TODO 실제 서버가 들어 들어갔다가 와서 하는 방향으로 바껴야 되는것임.. 밑은 데모버젼임
        ListView listview = (ListView) findViewById(R.id.jjal_list_listview);

        ArrayList<JjalData> arrayData = new ArrayList<JjalData>();
        arrayData.add(new JjalData("title1", "description1", ""));
        arrayData.add(new JjalData("title2", "description2", ""));
        arrayData.add(new JjalData("title3", "description3", ""));
        arrayData.add(new JjalData("title4", "description4", ""));

        AdapterJjal adapter = new AdapterJjal(this);
        adapter.setData(arrayData);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        Log.d("T", "click -> position -> " + position);

        // TODO 나중에는 바뀐다.
        Intent intent = new Intent(JjalListActivity.this, JjalActivity.class);
        startActivity(intent);
    }
}
