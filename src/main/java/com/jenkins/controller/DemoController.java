package com.jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/get")
    public String getMessage(){
        return "hello docker String....!";
    }

    @GetMapping("/getMessage")
    public String setMessage(){
        return "hello manoj";
    }
}
