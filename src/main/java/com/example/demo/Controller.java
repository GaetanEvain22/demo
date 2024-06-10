package com.example.demo;


import lombok.Data;

import org.springframework.web.bind.annotation.*;

@RestController
@Data
public class Controller {

    @GetMapping("/api/helloworld")
    public String sayHello() {
        return "Swagger Hello World";
    }
}