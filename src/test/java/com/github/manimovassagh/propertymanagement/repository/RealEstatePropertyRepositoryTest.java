package com.github.manimovassagh.propertymanagement.repository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.github.manimovassagh.propertymanagement.models.RealEstateAddress;
import com.github.manimovassagh.propertymanagement.models.RealEstateProperty;
import com.github.manimovassagh.propertymanagement.repositories.RealEstatePropertyRepository;

@ExtendWith(MockitoExtension.class)
class RealEstatePropertyRepositoryTest {

    @Mock
    private RealEstatePropertyRepository repository;

    @Test
    void testSaveAndFind() {
        RealEstateAddress address = new RealEstateAddress();
        RealEstateProperty property = new RealEstateProperty();
        property.setName("Repository Test Property");
        property.setAddress(address);
        property.setPrice(150000.0);
        
        UUID testId = UUID.randomUUID();
        // Stub repository behavior
        when(repository.save(any(RealEstateProperty.class))).thenAnswer(invocation -> {
            RealEstateProperty p = invocation.getArgument(0);
            // simulate setting an id during save
            // (assuming a setter exists; if not, adjust accordingly)
            p.setId(testId);
            return p;
        });
        when(repository.findById(testId)).thenReturn(Optional.of(property));

        property = repository.save(property);
        UUID id = property.getId();
        assertNotNull(id);

        RealEstateProperty found = repository.findById(id).orElse(null);
        assertNotNull(found);
        assertEquals("Repository Test Property", found.getName());
        assertEquals(150000.0, found.getPrice());
        assertEquals(address, found.getAddress());
    }
}