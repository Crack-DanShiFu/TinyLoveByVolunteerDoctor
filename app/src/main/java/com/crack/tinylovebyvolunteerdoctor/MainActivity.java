package com.crack.tinylovebyvolunteerdoctor;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.crack.adapter.RecommendRecyclerViewAdapter;
import com.crack.component.GlideImageLoader;
import com.crack.component.RecommendItem;
import com.crack.https.CallBackUtil;
import com.crack.https.OkhttpUtil;
import com.crack.utils.BaseActivity;
import com.crack.utils.LogUtils;

import com.yyydjk.library.BannerLayout;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends BaseActivity {
    @BindView(R.id.recommendRecyclerView)
    public RecyclerView mRecyclerView;
    @BindView(R.id.banner)
    public BannerLayout banner;


    private LinearLayoutManager mLinearLayoutManager;
    private List<RecommendItem> mData;
    private RecommendRecyclerViewAdapter recycleViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ButterKnife.bind(this);

        init();
        mData = new ArrayList<>();
        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        recycleViewAdapter=new RecommendRecyclerViewAdapter(mData);
        mRecyclerView.setCameraDistance(20);
        mRecyclerView.setAdapter(recycleViewAdapter);

        String url = "http://192.168.0.15:8080/main";
        OkhttpUtil.okHttpGet(url, new CallBackUtil.CallBackString() {
            @Override
            public void onFailure(Call call, Exception e) {}
            @Override
            public void onResponse(String response) {
                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
                LogUtils.d(response);
            }
        });
    }



    public void init(){
        final List<String> urls = new ArrayList<>();
        urls.add("https://pic.kuaizhan.com/g3/70/61/04e0-1185-4a74-99e1-8f287ab919c540/imageView/v1/thumbnail/640x320");
        urls.add("https://pic.kuaizhan.com/g3/29/3b/7f2a-9329-4414-a2cf-b94c082d4b5115/imageView/v1/thumbnail/640x360");
        urls.add("https://pic.kuaizhan.com/g3/79/44/784d-cc37-464a-be5d-b29e82e8ff0d04/imageView/v1/thumbnail/640x360");
        banner.setImageLoader(new GlideImageLoader());
        banner.setViewUrls(urls);
    }

}
