package co.edu.cun.inventory.repository;

import co.edu.cun.inventory.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RentRepository extends JpaRepository<Rent, Integer> {

    @Query("select r from Rent r where r.client.documentNumber = :documentNumber")
    List<Rent> findByClient(String documentNumber);
}
