package com.example.demo_deployment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/deploy")
    public String hello() {
        return "Hi this is Demo Spring Boot Application";
    }

}
