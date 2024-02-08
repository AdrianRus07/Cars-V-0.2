package Cars.CarsThymeleafe.service;

import Cars.CarsThymeleafe.controller.DTO.CarsDTO;
import Cars.CarsThymeleafe.entity.Cars;
import Cars.CarsThymeleafe.mapper.CarsMapper;
import Cars.CarsThymeleafe.repository.CarsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarsServiceImpl implements CarsService{
    private final CarsRepository carsRepository;
    private final CarsMapper carsMapper;


    @Override
    public List<CarsDTO> getCars() {
        return carsRepository.findAll().stream()
                .map(carsMapper::entityToDTO)
                .toList();
    }

    @Override
    public void deleteCar(Integer id) {
        carsRepository.deleteById(id);
    }

    @Override
    public void save(CarsDTO cars) {
        carsRepository.save(carsMapper.requestDTOToEntity(cars));

    }
    @Override
    public List<Cars> searchByName(String name){
        return carsRepository.findByNameContaining(name);
    }

    @Override
    public Optional<CarsDTO> findById(Integer id) {
        var optionalJoke = carsRepository.findById(id);
        return optionalJoke.map(carsMapper::entityToDTO);
    }


}

