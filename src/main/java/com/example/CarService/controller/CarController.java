package com.example.CarService.controller;

import com.example.CarService.models.entities.Car;
import com.example.CarService.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService service;

    @PostMapping
    public ResponseEntity<String> save(
            @RequestBody Car car
    ) {
        return ResponseEntity.ok(service.save(car));
    }

    @GetMapping
    public ResponseEntity<List<Car>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/numbers/{car_number}")
    public ResponseEntity<Car> findByNumber(
            @PathVariable("car_number") String number
    ) {
        return ResponseEntity.ok(service.findById(number));
    }

    @GetMapping("/models/{model}")
    public ResponseEntity<List<Car>> findByModel(
            @PathVariable("model") String model
    ) {
        return ResponseEntity.ok(service.findByModel(model));
    }

    @GetMapping("/dates/{date}")
    public ResponseEntity<List<Car>> findByDate(
            @PathVariable("date") @DateTimeFormat(pattern = "YYYY-mm-dd") Date date
    ) {
        return ResponseEntity.ok(service.findByDate(date));
    }

    @DeleteMapping("/{car_number}")
    public ResponseEntity<Void> delete(
            @PathVariable("car_number") String number
    ) {
        service.delete(number);
        return ResponseEntity.accepted().build();
    }
}
