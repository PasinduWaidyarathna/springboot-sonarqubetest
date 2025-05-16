package com.example.context.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller {

    @GetMapping("/test")
    public String testEndpoint() {
        return "Hello, Spring Boot! Pasindu Waidyarathna";
    }
}

