package com.example.simplechat;

import android.app.Application;

import com.parse.Parse;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class ChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Use for Android Monitoring
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();

        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("APP_ID")
                .clientBuilder(builder)
                .server("http://link.herokupapp.com").build()
        );
    }
}
