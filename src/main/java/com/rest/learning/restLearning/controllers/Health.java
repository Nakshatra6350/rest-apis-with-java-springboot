package com.rest.learning.restLearning.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {
    @GetMapping("/health")
    public String checkHealth(){
        return "OK";
    }
}
