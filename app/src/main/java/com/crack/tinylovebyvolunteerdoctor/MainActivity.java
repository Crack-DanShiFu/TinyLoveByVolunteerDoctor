package com.crack.tinylovebyvolunteerdoctor;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.crack.adapter.RecommendRecyclerViewAdapter;
import com.crack.component.RecommendItem;
import com.crack.utils.BaseActivity;
import com.crack.utils.LogUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    @BindView(R.id.recommendRecyclerView)
    public RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private List<RecommendItem> mData;
    private RecommendRecyclerViewAdapter recycleViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ButterKnife.bind(this);
        mData = new ArrayList<>();
        LogUtils.d("11111111");
        mData.add(new RecommendItem(R.drawable.ic_menu,"1111","2222"));

        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        recycleViewAdapter=new RecommendRecyclerViewAdapter(mData);
        mRecyclerView.setCameraDistance(20);
        mRecyclerView.setAdapter(recycleViewAdapter);
    }
}
