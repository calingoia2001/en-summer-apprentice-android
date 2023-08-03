package com.example.tmsandroid.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


public class Order implements Serializable {

    private Long orderID;


    private TicketCategory ticketCategory;


    private Customer customer;


    private LocalDate orderedAt;


    private int numberOfTickets;


    private int totalPrice;

    public Order() {
    }

    public Order(Long orderID, TicketCategory ticketCategory, Customer customer, LocalDate orderedAt, int numberOfTickets, int totalPrice) {
        this.orderID = orderID;
        this.ticketCategory = ticketCategory;
        this.customer = customer;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    // constructor for post order
    public Order(TicketCategory ticketCategory, Customer customer, int numberOfTickets, LocalDate orderedAt, int totalPrice) {
        this.ticketCategory = ticketCategory;
        this.customer = customer;
        this.numberOfTickets = numberOfTickets;
        this.orderedAt = orderedAt;
        this.totalPrice = totalPrice;
    }

    public Long getOrderID() {
        return orderID;
    }
    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }
    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomerID(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getOrderedAt() {
        return orderedAt;
    }
    public void setOrderedAt(LocalDate orderedAt) { this.orderedAt = orderedAt; }

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

    @Override
    public String toString() {
        return "Orders{" +
                "orderID=" + orderID +
                ", ticketCategory=" + ticketCategory +
                ", customer=" + customer +
                ", orderedAt=" + orderedAt +
                ", numberOfTickets=" + numberOfTickets +
                ", totalPrice=" + totalPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return numberOfTickets == order.numberOfTickets && totalPrice == order.totalPrice && Objects.equals(orderID, order.orderID) && Objects.equals(ticketCategory, order.ticketCategory) && Objects.equals(customer, order.customer) && Objects.equals(orderedAt, order.orderedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, ticketCategory, customer, orderedAt, numberOfTickets, totalPrice);
    }
}
