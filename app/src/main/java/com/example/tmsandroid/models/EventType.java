package com.example.tmsandroid.models;

import java.io.Serializable;
import java.util.Objects;


public class EventType implements Serializable {
    private Long eventTypeID;
    private String eventTypeName;

    public EventType() {}
    public EventType(Long eventTypeID, String eventTypeName) {
        this.eventTypeID = eventTypeID;
        this.eventTypeName = eventTypeName;
    }

    public Long getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(Long eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    @Override
    public String toString() {
        return "EventType{" +
                "eventTypeID=" + eventTypeID +
                ", eventTypeName='" + eventTypeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventType eventType = (EventType) o;
        return Objects.equals(eventTypeID, eventType.eventTypeID) && Objects.equals(eventTypeName, eventType.eventTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventTypeID, eventTypeName);
    }
}
