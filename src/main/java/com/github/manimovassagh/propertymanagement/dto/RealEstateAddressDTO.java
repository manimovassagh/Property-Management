package com.github.manimovassagh.propertymanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RealEstateAddressDTO {
    private String street;
    private String houseNumber;
    private String zipCode;
    private String city;
}