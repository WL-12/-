package com.example.kuou.Json;

import android.util.Log;

import com.example.kuou.Weathre_Activity;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
/**服务器交互**/
   public static void sendHttp(String address,okhttp3.Callback callback){
       OkHttpClient client=new OkHttpClient();
       Request request=new Request.Builder().url(address).build();
       client.newCall(request).enqueue(callback);
    //   Log.d(Weathre_Activity.class.toString(),"3333");
   }

}
