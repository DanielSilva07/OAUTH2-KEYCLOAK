package com.daniel.silva.OAUTH_KEYCLOAK.controller;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("/private")
    public String secureEndpoint(){
        return "Welcome, You can see this because you are Authenticated.";
    }

    @GetMapping("/private-scoped")
    @PostAuthorize("hasRole('USER')")
    public String unsecureEndpoint(){
        return "You can see this because you are Authenticated with a Token granted the 'USER' scope.";
    }

    @GetMapping("/public")
    public String publicEndpoint(){
        return "Welcome, You DO NOT need to be authenticated to call /api/public.";
    }
}
