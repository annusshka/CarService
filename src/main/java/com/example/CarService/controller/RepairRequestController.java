package com.example.CarService.controller;

import com.example.CarService.models.entities.Car;
import com.example.CarService.models.entities.RepairRequest;
import com.example.CarService.service.RepairRequestService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/repair")
@RequiredArgsConstructor
public class RepairRequestController {
    private final RepairRequestService service;
    @PostMapping
    public ResponseEntity<String> save(
            @RequestBody RepairRequest request
    ) {
        return ResponseEntity.ok(service.save(request));
    }

    @GetMapping
    public ResponseEntity<List<RepairRequest>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<RepairRequest> findById(
            @PathVariable("id") ObjectId id
    ) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/cars/{id}")
    public ResponseEntity<List<RepairRequest>> findByCar(
            @PathVariable("id") String number
    ) {
        return ResponseEntity.ok(service.findByCar(number));
    }

    @GetMapping("/dates/{date}")
    public ResponseEntity<List<RepairRequest>> findByDate(
            @PathVariable("date") @DateTimeFormat(pattern = "YYYY-mm-dd") Date date
    ) {
        return ResponseEntity.ok(service.findByDate(date));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable("id") ObjectId id
    ) {
        service.delete(id);
        return ResponseEntity.accepted().build();
    }
}
