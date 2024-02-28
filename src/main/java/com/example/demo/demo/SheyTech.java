package com.example.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SheyTech {

    @GetMapping(path = "/greetings")
    public String greetings() {
        return "Welcome to Shey Tech Writes!";
    }

}