package com.journey.journeycapstone.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Replaces @Controller and @ResponseBody
public class GreetingController {

    @RequestMapping("/")
    public String greeting(){
        return "Welcome to our journey!";
    }
}
