package co.edu.cun.inventory.mapper;

import co.edu.cun.inventory.entity.Rent;
import co.edu.cun.inventory.model.RentDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RentMapper {

    RentMapper INSTANCE = Mappers.getMapper(RentMapper.class);

    RentDto rentToRentDto(Rent rent);

    Rent rentDtoToRent(RentDto dto);

    List<RentDto> rentListToRentDtoList(List<Rent> rentList);

    List<Rent> rentDtoListToRentList(List<RentDto> rentDtoList);
}
