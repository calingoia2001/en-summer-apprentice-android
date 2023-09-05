package com.example.tmsandroid.retrofit;

import com.example.tmsandroid.models.Event;
import com.example.tmsandroid.models.EventType;
import com.example.tmsandroid.models.Venue;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface JavaAPI {
    @GET("/api/v1/venues")
    Call<List<Venue>> getAllVenue();

    @POST("/api/v1/venues")
    Call<Void> save(@Body Venue venue);

    @GET("api/v1/events")
    Call<List<Event>> getAllEvents();

    @GET("/api/v1/eventTypes")
    Call<List<EventType>> getAllEventTypes();

}
