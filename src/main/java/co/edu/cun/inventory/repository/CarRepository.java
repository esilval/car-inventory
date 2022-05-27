package co.edu.cun.inventory.repository;

import co.edu.cun.inventory.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Integer> {

    Optional<Car> findByPlateCar(String plateCar);
}
