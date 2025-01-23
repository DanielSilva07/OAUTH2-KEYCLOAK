package com.daniel.silva.OAUTH_KEYCLOAK.controller;

import com.daniel.silva.OAUTH_KEYCLOAK.model.Customer;
import com.daniel.silva.OAUTH_KEYCLOAK.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;


    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }

}
