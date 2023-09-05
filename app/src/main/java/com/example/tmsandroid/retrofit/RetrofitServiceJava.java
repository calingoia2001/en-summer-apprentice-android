package com.example.tmsandroid.retrofit;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitServiceJava {
    private Retrofit retrofit;
    public RetrofitServiceJava() {
        initalizeRetrofit();
    }

    private void initalizeRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.239:8080")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }

   public Retrofit getRetrofit() {
        return retrofit;
   }
}
