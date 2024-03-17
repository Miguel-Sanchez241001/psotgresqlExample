package com.example.clientpostgreslrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaRestController {
    
    @GetMapping("/persona")
    public String getPersona() {
        return "Hola mundo";
    }

}
