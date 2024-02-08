package Cars.CarsThymeleafe.mapper;

import Cars.CarsThymeleafe.controller.DTO.CarsDTO;
import Cars.CarsThymeleafe.entity.Cars;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarsMapper {

    CarsDTO entityToDTO(Cars cars);

    Cars requestDTOToEntity(CarsDTO carsDTO);




}
