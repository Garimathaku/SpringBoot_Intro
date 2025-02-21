package com.uc.hello_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Bridgelabz";
    }

    @GetMapping("/hello/query")
    public String sayHelloName(@RequestParam String name) {
        return "Hello " + name;
    }




}

