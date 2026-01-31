package com.proyecto.app.springboot.biblioteca.springboot_biblioteca.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/loans")
public class LoanController {
    @GetMapping("/list")
    public Map<String, String> list() {
        Map<String, String> response = new HashMap<>();
        response.put("name", "Pedro");
        return response;
    }
    
}
