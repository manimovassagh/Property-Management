package com.github.manimovassagh.propertymanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.manimovassagh.propertymanagement.dto.RealEstatePropertyRequestDTO;
import com.github.manimovassagh.propertymanagement.models.RealEstateProperty;
import com.github.manimovassagh.propertymanagement.repositories.RealEstatePropertyRepository;

@RestController
@RequestMapping("/api/properties")
public class RealEstatePropertyController {

    @Autowired
    private RealEstatePropertyRepository repository;
    
    @PostMapping
    public RealEstateProperty createProperty(@RequestBody RealEstatePropertyRequestDTO dto) {
        RealEstateProperty property = new RealEstateProperty();
        
        return repository.save(property);
    }
}
