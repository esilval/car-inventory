package co.edu.cun.inventory.repository;

import co.edu.cun.inventory.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Optional<Client> findByDocumentNumber(String documentNumber);
}
