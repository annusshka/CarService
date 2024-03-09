package com.example.CarService.service;

import com.example.CarService.models.entities.Client;
import com.example.CarService.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository repository;

    public String save(Client client) {
        return repository.save(client).getId().toString();
    }

    public Client findById(ObjectId id){
        return repository.findById(id).orElse(null);
    }

    public List<Client> findByName(String name){
        return repository.findByName(name);
    }

    public List<Client> findBySurname(String surname){
        return repository.findBySurname(surname);
    }

    public Client findByPhone(String phone) {
        return repository.findByPhone(phone);
    }

    public Client findByEmail(String email) {
        return repository.findByEmail(email);
    }

    public List<Client> findAll() {
        return repository.findAll();
    }

    public void delete(ObjectId id) {
        repository.deleteById(id);
    }
}
