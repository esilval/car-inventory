package co.edu.cun.inventory.controller;

import co.edu.cun.inventory.model.RentDto;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface IRentController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<RentDto> createRent(RequestEntity<RentDto> request);

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<RentDto>> getRents();

    @GetMapping(value="/client", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<RentDto>> getRentByDocument(@RequestParam(value = "document-number") String documentNumber);
}
