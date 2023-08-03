package com.example.tmsandroid.retrofit;

import com.example.tmsandroid.models.Event;
import com.example.tmsandroid.models.EventType;
import com.example.tmsandroid.models.Venue;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface VenueAPI {
    @GET("/api/v1/venues")
    Call<List<Venue>> getAllVenue();

    @POST("/api/v1/venues")
    Call<Void> save(@Body Venue venue);

    @GET("api/v1/events?venueID=2&eventType=Festival de Muzica")
    Call<List<Event>> getAllEvent();

    @GET("/api/v1/eventTypes")
    Call<List<EventType>> getAllEventTypes();

}
