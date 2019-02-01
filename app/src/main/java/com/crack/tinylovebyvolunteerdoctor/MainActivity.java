package com.crack.tinylovebyvolunteerdoctor;

import android.os.Bundle;

import com.crack.utils.BaseActivity;
import com.crack.utils.LogUtils;

import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        LogUtils.d("saasa");
        LogUtils.d("saasa");
        ButterKnife.bind(this);
    }
}
