package com.example.myprojects.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class HelloWorldController {

    @GetMapping("/")
    public String get() {
        return "Get";
    }
    @PostMapping("/")
    public String post() {
        return "Post";
    }
    @PutMapping ("/")
    public String put() {
        return "Put";
    }
    @DeleteMapping ("/")
    public String delete() {
        return "Delete";
    }
}