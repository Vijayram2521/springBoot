package com.vjulakan.springDI.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @Value("${app.name}")
    private static String environment ;
    @RequestMapping("/hello")
    public String sayHelloWorld(){
        return "You are now running " ;
    }
}
