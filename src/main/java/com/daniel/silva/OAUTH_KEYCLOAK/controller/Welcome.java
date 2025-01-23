package com.daniel.silva.OAUTH_KEYCLOAK.controller;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/secure")
    public String welcomeToSecure(){
        return "WelcomeToSecure";
    }

    @GetMapping("/unsecure")
    @PostAuthorize("hasRole('USER')")
    public String welcomeToUnsecure(){
        return "WelcomeToUnsecure";
    }

    @GetMapping("/gg")
    public String welcomeToGG(){
        return "WelcomeToGG";
    }
}
