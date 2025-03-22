package com.github.manimovassagh.propertymanagement.property;

import java.util.UUID;

import com.github.manimovassagh.propertymanagement.models.RealEstateAddress;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class RealEstateProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private RealEstateAddress address;

    private double price;

    // Constructors
    public RealEstateProperty() {
    }

    public RealEstateProperty(UUID id, String name, RealEstateAddress address, double price) {
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

    public RealEstateAddress getAddress() {
        return address;
    }

    public void setAddress(RealEstateAddress address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}