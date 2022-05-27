package co.edu.cun.inventory.controller;

import co.edu.cun.inventory.model.CarDto;
import co.edu.cun.inventory.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController implements ICarController{

    private CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<CarDto> createCar(RequestEntity<CarDto> request) {
        try {
            return ResponseEntity.ok(service.addCar(request.getBody()));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }

    @Override
    public ResponseEntity<List<CarDto>> getAllCars() {
        return ResponseEntity.ok(service.getAllCars());
    }
}
