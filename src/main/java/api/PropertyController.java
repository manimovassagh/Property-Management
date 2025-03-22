package api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.manimovassagh.propertymanagement.dto.RealEstatePropertyRequestDTO;

import service.PropertyService;

@RestController
@RequestMapping("/api/v1/property")
public class PropertyController {

    private final PropertyService propertyService = new PropertyService();

    @PostMapping
    public ResponseEntity<String> createProperty(@RequestBody RealEstatePropertyRequestDTO propertyDto) {
        // Delegate property creation to the service
        String result = propertyService.create(propertyDto);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<String> getProperties() {
        // add logic to get property list if necessary
        return new ResponseEntity<>("Property list", HttpStatus.OK);
    }
}