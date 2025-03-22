package com.github.manimovassagh.propertymanagement.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RealEstatePropertyRequestDTO {
    private String name;
    private double price;
    private RealEstateAddressDTO address;
    private List<String> photos;
}