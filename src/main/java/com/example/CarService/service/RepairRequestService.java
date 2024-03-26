package com.example.CarService.service;

import com.example.CarService.models.entities.RepairRequest;
import com.example.CarService.repository.RepairRequestRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RepairRequestService {
    private final RepairRequestRepository repository;

    public String save(RepairRequest request) {
        return repository.save(request).getId().toString();
    }

    public RepairRequest findById(ObjectId id){
        return repository.findById(id).orElse(null);
    }

    public List<RepairRequest> findByCar(String number){
        return repository.findByCar(number);
    }

    public List<RepairRequest> findByDate(Date date){
        return repository.findByDate(date);
    }

    public List<RepairRequest> findAll() {
        return repository.findAll();
    }

    public void delete(ObjectId id) {
        repository.deleteById(id);
    }
}
