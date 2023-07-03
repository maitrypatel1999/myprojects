package com.example.myprojects.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@Slf4j
public class HelloWorldController {

    @GetMapping("/")
    public String get() {
//        log.info("calling get api");
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