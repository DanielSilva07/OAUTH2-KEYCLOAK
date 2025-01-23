package com.daniel.silva.OAUTH_KEYCLOAK.repository;

import com.daniel.silva.OAUTH_KEYCLOAK.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
