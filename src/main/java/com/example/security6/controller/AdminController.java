package com.example.security6.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AdminController {

    @GetMapping("/admin")
    public String adminP() {
        return "Admin";
    }
}
