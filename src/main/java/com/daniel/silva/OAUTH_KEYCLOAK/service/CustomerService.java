package com.daniel.silva.OAUTH_KEYCLOAK.service;

import com.daniel.silva.OAUTH_KEYCLOAK.model.Customer;
import com.daniel.silva.OAUTH_KEYCLOAK.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public List<Customer> getAll() {
        return customerRepository.findAll();
    }



}
