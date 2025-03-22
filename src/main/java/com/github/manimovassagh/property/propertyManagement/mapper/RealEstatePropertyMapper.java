import com.github.manimovassagh.propertymanagement.dto.RealEstatePropertyRequestDTO;
import com.github.manimovassagh.propertymanagement.models.RealEstateAddress;
import com.github.manimovassagh.propertymanagement.models.RealEstateProperty;

public class RealEstatePropertyMapper {

    public static RealEstateProperty toEntity(RealEstatePropertyRequestDTO dto) {
        RealEstateProperty property = new RealEstateProperty();
        property.setName(dto.getName());
        property.setPrice(dto.getPrice());
        if (dto.getAddress() != null) {
            RealEstateAddress address = new RealEstateAddress();
            address.setStreet(dto.getAddress().getStreet());
            address.setCity(dto.getAddress().getCity());
            address.setStreet(dto.getAddress().getStreet());
            address.setPostalCode(dto.getAddress().getZipCode());
            property.setAddress(address);
        }
        if (dto.getPhotos() != null) {
            dto.getPhotos().forEach(property::addPhoto);
        }
        return property;
    }
}