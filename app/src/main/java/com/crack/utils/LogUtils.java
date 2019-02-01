package com.crack.utils;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class LogUtils {
    private static LogUtils logUtils;

    public LogUtils() {
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    public static LogUtils getInstance(){
        if (logUtils == null){
            logUtils=new LogUtils();
            System.out.println("LogUtils.getInstance()执行");
        }
        return logUtils;
    }
    public static void d(String logInfo){
        LogUtils.getInstance();
        Logger.d(logInfo);
    }
}
