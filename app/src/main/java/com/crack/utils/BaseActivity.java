package com.crack.utils;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.crack.ManagerActivity.ManagerActivity;

import java.util.logging.Logger;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ManagerActivity.getInstance().addActivity(this);

        //添加Activity到容器
    }
    //这里做其他的activity公共操作
    //比如跳转activity、设置状态栏等
}