package Cars.CarsThymeleafe.service;

import Cars.CarsThymeleafe.controller.DTO.CarsDTO;
import Cars.CarsThymeleafe.entity.Cars;

import java.util.List;
import java.util.Optional;

public interface CarsService {

    List<CarsDTO> getCars();

    void deleteCar(Integer id);

    void save(CarsDTO cars);

    List<Cars> searchByName(String name);


    Optional<CarsDTO> findById(Integer id);
}
