package com.framgia.httpurlconnectionexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.framgia.httpurlconnectionexample.entity.Data;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements FetchDataTask.OnLoadDataFinishedListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String END_POINT_URL = "https://api.github.com/users/google/repos";
    private RecyclerView mRecyclerData;
    private DataAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerData = findViewById(R.id.recycler_data);

        new FetchDataTask(this).execute(END_POINT_URL);
    }

    @Override
    public void onLoadFinished(ArrayList<Data> datas) {
        mAdapter = new DataAdapter(this, datas);
        mRecyclerData.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerData.setAdapter(mAdapter);
    }
}
