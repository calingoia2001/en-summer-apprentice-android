package com.example.tmsandroid.models;

public class OrderTest {
    private int eventID;
    private String orderedAt;
    private int numberOfTickets;
    private int totalPrice;
    private boolean isExpanded;

    public OrderTest(int eventID, String orderedAt, int numberOfTickets, int totalPrice) {
        this.eventID = eventID;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
        isExpanded = false;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(String orderedAt) {
        this.orderedAt = orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }

    @Override
    public String toString() {
        return "Order{" +
                "eventID=" + eventID +
                ", orderedAt='" + orderedAt + '\'' +
                ", numberOfTickets=" + numberOfTickets +
                ", totalPrice=" + totalPrice +
                ", isExpanded=" + isExpanded +
                '}';
    }
}
