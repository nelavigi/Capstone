package com.example.patientManagementSystem.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebappController {
    @GetMapping("/")
    public String getIndex() {
        return "index.html";
    }
}
