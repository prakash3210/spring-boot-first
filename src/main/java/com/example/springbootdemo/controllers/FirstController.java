package com.example.springbootdemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class FirstController {

    public String sayHello(){
        System.out.println("Hello World Spring Boot!!");
        return "Hello World Spring Boot!!!!";
    }
}
