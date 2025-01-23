package com.daniel.silva.OAUTH_KEYCLOAK;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class OauthKeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthKeycloakApplication.class, args);
	}

}
