package com.uc.hello_app.controller;

import com.uc.hello_app.DTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    //method to show hello from bridgelabz
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Bridgelabz";
    }
 //method to show hello with name
    @GetMapping("/hello/query")
    public String sayHelloName(@RequestParam String name) {
        return "Hello " + name;
    }
    @GetMapping("/param/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/post")
    public String sayHelloRequestBody(@RequestBody DTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    @PutMapping("/put/{firstName}")
    public String updateHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }


}

