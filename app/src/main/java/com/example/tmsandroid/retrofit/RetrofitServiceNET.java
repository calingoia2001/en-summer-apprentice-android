package com.example.tmsandroid.retrofit;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitServiceNET {
    private Retrofit retrofit;
    public RetrofitServiceNET() {
        initalizeRetrofit();
    }

    private void initalizeRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://172.16.99.39:8081")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
