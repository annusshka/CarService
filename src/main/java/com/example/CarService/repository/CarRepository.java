package com.example.CarService.repository;

import com.example.CarService.models.entities.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends MongoRepository<Car, String> {

    Optional<Car> findById(String number);

    List<Car> findByModel(String model);

    List<Car> findByDate(Date date);
}
