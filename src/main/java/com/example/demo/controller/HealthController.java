package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    public ResponseEntity<HashMap<String, String>> health() {
        HashMap<String, String> data = new HashMap<>();
        data.put("status", "UP");
        return ResponseEntity.ok(data);
    }
}
