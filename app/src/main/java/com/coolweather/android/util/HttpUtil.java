package com.coolweather.android.util;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by qweenhool on 2017/1/24.
 */

public class HttpUtil {
    public static void sendOKHttpRequest(String address, Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        Request request = builder.url(address).build();
        Call call = client.newCall(request);
        call.enqueue(callback);
    }
}
