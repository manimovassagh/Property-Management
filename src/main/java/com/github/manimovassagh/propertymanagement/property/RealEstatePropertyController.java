package com.github.manimovassagh.propertymanagement.property;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/property")
public class RealEstatePropertyController {


    @GetMapping
    public String getProperty() {
        return "Hello World";
    }
}
