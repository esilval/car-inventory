package co.edu.cun.inventory.service;

import co.edu.cun.inventory.mapper.RentMapper;
import co.edu.cun.inventory.model.RentDto;
import co.edu.cun.inventory.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentService {

    private RentRepository repository;

    @Autowired
    public RentService(RentRepository repository) {
        this.repository = repository;
    }

    public RentDto addRent(RentDto rentDto) {
        return RentMapper.INSTANCE.rentToRentDto(
                repository.save(RentMapper.INSTANCE.rentDtoToRent(rentDto)));
    }

    public List<RentDto> getAllRents() {
        return RentMapper.INSTANCE.rentListToRentDtoList(repository.findAll());
    }

    public List<RentDto> getRentsByDocumentNumber(final String documentNumber) {
        return RentMapper.INSTANCE.rentListToRentDtoList(repository.findByClient(documentNumber));
    }
}
