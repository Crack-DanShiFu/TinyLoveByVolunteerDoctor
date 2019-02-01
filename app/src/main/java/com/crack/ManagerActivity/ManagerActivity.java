package com.crack.ManagerActivity;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ManagerActivity {
    /**
     * 装载Activity的容器
     * */
    private List<Activity> activities= new ArrayList<>();

    /**
     * 声明当前；类的实例对象
     * */
    private static ManagerActivity managerActivity;
    /**
     * 单例模式  构造方法私有化
     * */
    private ManagerActivity(){

    }

    /**
     * 返回当前实例对象
     * */
    public  static  ManagerActivity getInstance(){
        if(managerActivity == null){
            managerActivity = new ManagerActivity();
        }
        return managerActivity;
    }
    /**
     * 添加Activity到容器
     * */
    public void addActivity(Activity activity){
        activities.add(activity);
    }

    /**
     * 移除Activity
     * */
    public void removeActivity(Activity activity){
        if(activities.contains(activity)){
            activities.remove(activity);
            activity.finish();
        }
    }

    /**
     * 退出
     * */
    public void exit(){
        for (Activity activity : activities) {
            activity.finish();
        }
    }
}
