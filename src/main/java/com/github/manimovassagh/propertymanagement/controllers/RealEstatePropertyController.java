package com.github.manimovassagh.propertymanagement.property;


import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/property")
public class RealEstatePropertyController {

  @GetMapping
  public ResponseEntity<RealEstateProperty> getProperty() {
    RealEstateProperty property = new RealEstateProperty();
    property.setName("Mani property");
    property.setId(UUID.randomUUID());
    RealEstateAddress address = new RealEstateAddress();
    address.setCity("Berlin");
    address.setId(UUID.randomUUID());
    address.setHouseNumber("12");
    address.setPostalCode("12345");
    address.setStreet("Main Street");
    property.setAddress(address);
    property.setPrice(250000.00);

    return ResponseEntity.ok(property);
  }
}
