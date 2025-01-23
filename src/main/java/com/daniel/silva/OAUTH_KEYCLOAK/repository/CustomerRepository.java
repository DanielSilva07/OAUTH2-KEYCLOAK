package com.daniel.silva.OAUTH_KEYCLOAK.repository;

import com.daniel.silva.OAUTH_KEYCLOAK.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer>findByEmail(String email);
}
