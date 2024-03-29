package com.example.CarService.repository;

import com.example.CarService.models.entities.Client;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends MongoRepository<Client, ObjectId> {

    List<Client> findByName(String name);
    List<Client> findBySurname(String surname);

    Client findByPhone(String phone);

    Client findByEmail(String email);
}
