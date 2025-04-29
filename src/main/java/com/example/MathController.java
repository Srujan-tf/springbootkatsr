package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "Result: " + (a + b);
    }
}