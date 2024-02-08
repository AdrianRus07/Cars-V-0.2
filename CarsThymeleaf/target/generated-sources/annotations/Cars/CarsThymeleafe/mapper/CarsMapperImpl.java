package Cars.CarsThymeleafe.mapper;

import Cars.CarsThymeleafe.controller.DTO.CarsDTO;
import Cars.CarsThymeleafe.entity.Cars;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-06T17:20:21+0200",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class CarsMapperImpl implements CarsMapper {

    @Override
    public CarsDTO entityToDTO(Cars cars) {
        if ( cars == null ) {
            return null;
        }

        CarsDTO carsDTO = new CarsDTO();

        carsDTO.setId( cars.getId() );
        carsDTO.setFabricationYear( cars.getFabricationYear() );
        carsDTO.setName( cars.getName() );
        carsDTO.setSeries( cars.getSeries() );
        carsDTO.setMotorType( cars.getMotorType() );
        carsDTO.setPrice( cars.getPrice() );

        return carsDTO;
    }

    @Override
    public Cars requestDTOToEntity(CarsDTO carsDTO) {
        if ( carsDTO == null ) {
            return null;
        }

        Cars cars = new Cars();

        cars.setId( carsDTO.getId() );
        cars.setFabricationYear( carsDTO.getFabricationYear() );
        cars.setName( carsDTO.getName() );
        cars.setSeries( carsDTO.getSeries() );
        cars.setMotorType( carsDTO.getMotorType() );
        cars.setPrice( carsDTO.getPrice() );

        return cars;
    }
}
