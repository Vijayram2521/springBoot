package com.vjulakan.springDI.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {


    @RequestMapping("/hello")
    public String sayHelloWorld(){
        return "You are now running " ;
    }
}
