package com.example.tmsandroid.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Event implements Serializable {
    private Long eventID;
    private Venue venue;
    private List<TicketCategory> ticketCategories = new ArrayList<>();
    private EventType eventType;
    private String eventDescription;

    private String eventName;
    private LocalDate startDate;

    private LocalDate endDate;

    public Event() {}
    public Event(Long eventID, Venue venue, EventType eventType, String eventDescription, String eventName, LocalDate startDate, LocalDate endDate) {
        this.eventID = eventID;
        this.venue = venue;
        this.eventType = eventType;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public List<TicketCategory> getTicketCategories() {
        return ticketCategories;
    }

    public void setTicketCategories(List<TicketCategory> ticketCategories) {
        this.ticketCategories = ticketCategories;
    }

    public Long getEventID() { return eventID; }
    public void setEventID(Long eventID) { this.eventID = eventID; }

    public Venue getVenue() { return venue; }
    public void setVenue(Venue venue) { this.venue = venue; }

    public EventType getEventType() { return eventType;}
    public void setEventType(EventType eventType) { this.eventType = eventType; }

    public String getEventDescription() { return eventDescription; }
    public void setEventDescription(String eventDescription) { this.eventDescription = eventDescription; }

    public String getEventName() { return eventName;}
    public void setEventName(String eventName) { this.eventName = eventName; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + eventID +
                ", venue=" + venue +
                ", eventType=" + eventType +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventName='" + eventName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(eventID, event.eventID) && Objects.equals(venue, event.venue) && Objects.equals(ticketCategories, event.ticketCategories) && Objects.equals(eventType, event.eventType) && Objects.equals(eventDescription, event.eventDescription) && Objects.equals(eventName, event.eventName) && Objects.equals(startDate, event.startDate) && Objects.equals(endDate, event.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventID, venue, ticketCategories, eventType, eventDescription, eventName, startDate, endDate);
    }
}