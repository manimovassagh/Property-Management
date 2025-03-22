package com.github.manimovassagh.propertymanagement.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
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

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private RealEstateAddress address;

    private double price;

    // Updated to use a type-safe Photo embeddable
    @ElementCollection
    @CollectionTable(name = "property_photos", joinColumns = @JoinColumn(name = "property_id"))
    private List<Photo> photos = new ArrayList<>();

    // Constructors
    public RealEstateProperty() {
    }

    public RealEstateProperty(UUID id, String name, RealEstateAddress address, double price) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.price = price;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    // Add a helper method to add a photo by URL
    public void addPhoto(String photoUrl) {
        this.photos.add(new Photo(photoUrl));
    }

}