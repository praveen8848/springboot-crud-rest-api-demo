package com.spring_starter.Springboot_tutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @GetMapping("/")
    public String helloWorld(){
        return "Welcome to SpringBoot tutorial. My name is Praveen.";
    }

}
