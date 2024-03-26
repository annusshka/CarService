package com.example.CarService.repository;

import com.example.CarService.models.entities.RepairRequest;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface RepairRequestRepository extends MongoRepository<RepairRequest, ObjectId> {

    Optional<RepairRequest> findById(ObjectId id);
    List<RepairRequest> findByCar(String number);

    List<RepairRequest> findByDate(Date date);
}
