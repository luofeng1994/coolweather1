package com.coolweather.app.util;

/**
 * Created by 罗峰 on 2016/8/1.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
