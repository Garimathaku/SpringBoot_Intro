package com.uc.hello_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Bridgelabz";
    }

    @GetMapping("/hello/query")
    public String sayHelloName(@RequestParam String name) {
        return "Hello " + name;
    }
    @GetMapping("/param/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }




}

