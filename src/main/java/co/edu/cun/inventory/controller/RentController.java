package co.edu.cun.inventory.controller;


import co.edu.cun.inventory.model.RentDto;
import co.edu.cun.inventory.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rents")
public class RentController implements IRentController {

    private RentService service;

    @Autowired
    public RentController(RentService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<RentDto> createRent(RequestEntity<RentDto> request) {
        try {
            return ResponseEntity.ok(service.addRent(request.getBody()));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }

    @Override
    public ResponseEntity<List<RentDto>> getRents() {
        return ResponseEntity.ok(service.getAllRents());
    }

    @Override
    public ResponseEntity<List<RentDto>> getRentByDocument(String documentNumber) {
        return ResponseEntity.ok(service.getRentsByDocumentNumber(documentNumber));
    }
}
