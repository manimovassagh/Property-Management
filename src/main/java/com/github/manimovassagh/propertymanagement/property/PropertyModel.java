package com.github.manimovassagh.propertymanagement.property;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class PropertyModel {

    @Id
    UUID id;
    String name;
    String description;

}
