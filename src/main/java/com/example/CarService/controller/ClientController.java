package com.example.CarService.controller;

import com.example.CarService.models.entities.Client;
import com.example.CarService.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<String> save(
            @RequestBody Client client
    ) {
        return ResponseEntity.ok(clientService.save(client));
    }

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        return ResponseEntity.ok(clientService.findAll());
    }

    @GetMapping("/id/{client-id}")
    public ResponseEntity<Client> findById(
            @PathVariable("client-id") ObjectId id
    ) {
        return ResponseEntity.ok(clientService.findById(id));
    }

    @GetMapping("/names/{client-name}")
    public ResponseEntity<List<Client>> findByName(
            @PathVariable("client-name") String name
    ) {
        return ResponseEntity.ok(clientService.findByName(name));
    }

    @GetMapping("/surnames/{client-surname}")
    public ResponseEntity<List<Client>> findBySurname(
            @PathVariable("client-surname") String surname
    ) {
        return ResponseEntity.ok(clientService.findBySurname(surname));
    }

    @GetMapping("/phones/{client-phone}")
    public ResponseEntity<Client> findByPhone(
            @PathVariable("client-phone") String phone
    ) {
        return ResponseEntity.ok(clientService.findByPhone(phone));
    }

    @GetMapping("/emails/{client-email}")
    public ResponseEntity<Client> findByEmail(
            @PathVariable("client-email") String email
    ) {
        return ResponseEntity.ok(clientService.findByEmail(email));
    }

    @DeleteMapping("/{client-id}")
    public ResponseEntity<Void> delete(
            @PathVariable("client-id") ObjectId id
            ) {
        clientService.delete(id);
        return ResponseEntity.accepted().build();
    }
}
