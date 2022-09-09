package com.example.airline_api.models;

import javax.persistence.*;

@Entity(name = 'passengers')
public class Passsenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phoneNumber")
    private int phoneNumber;

    public Passenger(String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Passsenger() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
