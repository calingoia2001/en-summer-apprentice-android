package com.example.tmsandroid.models;


import java.io.Serializable;
import java.util.Objects;


public class TicketCategory implements Serializable {
    private Long ticketCategoryID;
    private Event event;
    private String description;
    private int price;

    public TicketCategory() {}
    public TicketCategory(Long ticketCategoryID, Event event, String description, int price) {
        this.ticketCategoryID = ticketCategoryID;
        this.event = event;
        this.description = description;
        this.price = price;
    }

    public Long getTicketCategoryID() {
        return ticketCategoryID;
    }
    public void setTicketCategoryID(Long ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Event getEventID() {
        return event;
    }
    public void setEventID(Event event) {
        this.event = event;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TicketCategory{" +
                "ticketCategoryID=" + ticketCategoryID +
                ", event=" + event +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketCategory that = (TicketCategory) o;
        return price == that.price && Objects.equals(ticketCategoryID, that.ticketCategoryID) && Objects.equals(event, that.event) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketCategoryID, event, description, price);
    }
}
