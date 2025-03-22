package com.github.manimovassagh.propertymanagement.property;

import org.hibernate.mapping.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RealEstatePropertyRepository extends JpaRepository<RealEstateProperty, UUID> {
}