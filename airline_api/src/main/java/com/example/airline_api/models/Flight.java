package com.example.airline_api.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "destination")
    private String destination;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "departureDate")
    private String departureDate;

    @Column(name = "departureTime")
    private String departureTime;

    private List<Passsenger> passsengers;

    public Flight (String destination, int capacity, String departureDate, String departureTime){
        this.destination = destination;
        this.capacity = capacity;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.passsengers = new ArrayList<>();
    }

    public Flight() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public List<Passsenger> getPasssengers() {
        return passsengers;
    }

    public void setPasssengers(List<Passsenger> passsengers) {
        this.passsengers = passsengers;
    }
}
