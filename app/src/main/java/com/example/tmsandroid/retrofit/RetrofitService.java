package com.example.tmsandroid.retrofit;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
    private Retrofit retrofit;
    public RetrofitService() {
        initalizeRetrofit();
    }

    private void initalizeRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://172.16.124.21:8080")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }

   public Retrofit getRetrofit() {
        return retrofit;
   }
}
