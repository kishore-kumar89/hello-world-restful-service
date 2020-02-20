package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HelloController {
    @RequestMapping("/login")
    String sayHello(){
        return "Hello there";
    }
}
