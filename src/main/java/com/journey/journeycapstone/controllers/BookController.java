package com.journey.journeycapstone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/catalog")
public class BookController {

    @GetMapping
    @ResponseBody
    public String books(){
        return "Catalog of books page";
    }



}
