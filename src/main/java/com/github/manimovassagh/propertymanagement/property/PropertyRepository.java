package com.github.manimovassagh.propertymanagement.property;

import org.hibernate.mapping.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
