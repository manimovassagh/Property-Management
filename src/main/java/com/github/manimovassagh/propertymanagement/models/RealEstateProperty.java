package com.github.manimovassagh.propertymanagement.models;

import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class RealEstateProperty {

    // Getters and Setters
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

}