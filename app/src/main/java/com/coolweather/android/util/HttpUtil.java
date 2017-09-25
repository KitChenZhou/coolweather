package com.coolweather.android.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by D22395 on 2017/9/19.
 *从服务器获取全国所有省市县的数据
 */

public class HttpUtil {

    // 传入请求地址，并注册一个回调来处理服务器相应
    public static void sendOkHttpRequest(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
