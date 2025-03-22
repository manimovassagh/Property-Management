package com.github.manimovassagh.propertymanagement.property;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;



@Entity
public class RealEstateProperty { // Renamed from Property to RealEstateProperty

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String address;
    private double price;

    // Constructors
    public RealEstateProperty() {
    }

    public RealEstateProperty(UUID id, String name, String address, double price) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.price = price;
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}