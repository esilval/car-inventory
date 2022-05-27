package co.edu.cun.inventory.service;

import co.edu.cun.inventory.entity.Car;
import co.edu.cun.inventory.mapper.CarMapper;
import co.edu.cun.inventory.model.CarDto;
import co.edu.cun.inventory.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private CarRepository repository;

    @Autowired
    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public CarDto addCar(CarDto carDto) throws Exception {
        Optional<Car> optCar = repository.findByPlateCar(carDto.getPlateCar());
        if (optCar.isPresent()) {
            throw new Exception("Car exists");
        }

        final Car added = repository.save(CarMapper.INSTANCE.carDtoToCar(carDto));
        return CarMapper.INSTANCE.carToCarDto(added);
    }

    public List<CarDto> getAllCars() {
        return CarMapper.INSTANCE.carListToCarDtoList(repository.findAll());
    }

}
