package com.github.manimovassagh.propertymanagement.models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class RealEstatePropertyTest {

    @Test
    void testConstructorAndGetters() {
        UUID id = UUID.randomUUID();
        String name = "Test Property";
        RealEstateAddress address = new RealEstateAddress(); // ...existing implementation...
        double price = 100000.0;
        RealEstateProperty property = new RealEstateProperty(id, name, address, price);
        assertEquals(id, property.getId());
        assertEquals(name, property.getName());
        assertEquals(address, property.getAddress());
        assertEquals(price, property.getPrice());
    }

    @Test
    void testSetters() {
        RealEstateProperty property = new RealEstateProperty();
        UUID id = UUID.randomUUID();
        String name = "Test Property Setters";
        RealEstateAddress address = new RealEstateAddress(); // ...existing implementation...
        double price = 200000.0;
        property.setId(id);
        property.setName(name);
        property.setAddress(address);
        property.setPrice(price);
        assertEquals(id, property.getId());
        assertEquals(name, property.getName());
        assertEquals(address, property.getAddress());
        assertEquals(price, property.getPrice());
    }
}
