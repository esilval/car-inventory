package co.edu.cun.inventory.mapper;

import co.edu.cun.inventory.entity.Car;
import co.edu.cun.inventory.model.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDto carToCarDto(Car car);

    Car carDtoToCar(CarDto carDto);

    List<CarDto> carListToCarDtoList(List<Car> carList);

    List<Car> carDtoListToCar(List<CarDto> carDtoList);

}
