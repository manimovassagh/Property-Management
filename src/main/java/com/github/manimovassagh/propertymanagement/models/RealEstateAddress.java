package com.github.manimovassagh.propertymanagement.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class RealEstateAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private java.util.UUID id;

    private String street;
    private String houseNumber;
    private String postalCode;
    private String city;
    private String addressLine;

    public RealEstateAddress(UUID id, String street, String houseNumber, String postalCode, String city) {
        this.id = id;
        this.street = street;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.city = city;

    }

    public RealEstateAddress() {
    }

    public UUID getId() {
        return id;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }
}
