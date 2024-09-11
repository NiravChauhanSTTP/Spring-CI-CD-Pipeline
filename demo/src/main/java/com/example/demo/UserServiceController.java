package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Jenkins CI/CD Pipeline!";
    }
}