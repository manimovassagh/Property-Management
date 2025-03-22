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

    return ResponseEntity.ok(property);
  }
}
