package com.github.manimovassagh.propertymanagement.repositories;

import com.github.manimovassagh.propertymanagement.models.RealEstateProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RealEstatePropertyRepository extends JpaRepository<RealEstateProperty, UUID> {
}