package com.example.tmsandroid.retrofit;

import com.example.tmsandroid.models.Event;
import com.example.tmsandroid.models.Venue;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NetAPI {
    @GET("api/Event/GetAll")
    Call<List<Event>> GetAll();
}
