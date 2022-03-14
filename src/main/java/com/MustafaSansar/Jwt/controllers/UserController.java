package com.MustafaSansar.Jwt.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hellospringsecurity")
    public String hellospringsecurity() {
        return "hellospringsecurity";
    }
}
