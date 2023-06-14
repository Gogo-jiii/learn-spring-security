package com.example.learnspringsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    
    @GetMapping("/test")
    public String name() {
        return "test.html";
    }

     @GetMapping("/home")
    public String home() {
        return "home.html";
    }
}
