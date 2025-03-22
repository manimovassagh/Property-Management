package com.github.manimovassagh.propertymanagement.property;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;



@Setter
@Entity
@Table(name = "properties") // Ensuring no conflicts with reserved keywords
public class RealEstateProperty { // Renamed from Property to RealEstateProperty

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

}