package com.mufli.MufliBackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthcheckController {


    @GetMapping(value = "/healthcheck")
    public String monitorHealth() {
        return "{\"Status\": \"UP\"}";
    }
}
