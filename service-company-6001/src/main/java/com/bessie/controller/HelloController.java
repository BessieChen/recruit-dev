package com.bessie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("c")
public class HelloController {
    @GetMapping("hello")
    public Object Hello(){
        return "Hello Bessie UserService~~~";
    }
}
