package com.xiwoo.game.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping
    public String main(String a) {
        return "aa";
    }
}
