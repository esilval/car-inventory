package co.edu.cun.inventory.mapper;

import co.edu.cun.inventory.entity.Client;
import co.edu.cun.inventory.model.ClientDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    ClientDto clientToClientDto(Client client);

    Client clientDtoToClient(ClientDto clientDto);

    List<ClientDto> clientListToClientDtoList(List<Client> clientList);

    List<Client> clientDtoListToClientList(List<ClientDto> clientDtoList);
}
