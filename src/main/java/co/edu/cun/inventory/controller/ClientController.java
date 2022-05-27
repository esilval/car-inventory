package co.edu.cun.inventory.controller;

import co.edu.cun.inventory.model.ClientDto;
import co.edu.cun.inventory.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController implements IClientController {

    private ClientService service;

    @Autowired
    public ClientController(ClientService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<ClientDto> createClient(RequestEntity<ClientDto> request) {
        try {
            return ResponseEntity.ok(service.addClient(request.getBody()));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }

    @Override
    public ResponseEntity<List<ClientDto>> getAllClients() {
        return ResponseEntity.ok(service.getAllClients());
    }
}
