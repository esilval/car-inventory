package co.edu.cun.inventory.service;

import co.edu.cun.inventory.entity.Client;
import co.edu.cun.inventory.mapper.ClientMapper;
import co.edu.cun.inventory.model.ClientDto;
import co.edu.cun.inventory.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public ClientDto addClient(ClientDto clientDto) throws Exception {
        final Optional<Client> optClient = repository.findByDocumentNumber(clientDto.getDocumentNumber());
        if (optClient.isPresent()) {
            throw new Exception("Client exists.");
        }
        return ClientMapper.INSTANCE.clientToClientDto(
                repository.save(ClientMapper.INSTANCE.clientDtoToClient(clientDto)));
    }

    public List<ClientDto> getAllClients() {
        return ClientMapper.INSTANCE.clientListToClientDtoList(repository.findAll());
    }
}
