package com.example.CarService.service;

import com.example.CarService.models.entities.Car;
import com.example.CarService.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository repository;

    public String save(Car car) {
        return repository.save(car).getNumber();
    }

    public Car findById(String id){
        return repository.findById(id).orElse(null);
    }

    public List<Car> findByModel(String model){
        return repository.findByModel(model);
    }

    public List<Car> findByDate(Date date){
        return repository.findByDate(date);
    }

    public List<Car> findAll() {
        return repository.findAll();
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

}
