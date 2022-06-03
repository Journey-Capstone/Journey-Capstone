package com.journey.journeycapstone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main")
public class BookController {

    @GetMapping

    public String mainPage(){
        return "main/main";
    }

    @GetMapping("/books")
    public String singleBook(){
        return "main/singleBook";
    }

    @GetMapping("/catalog")
    public String catalogPage(){
        return "main/catalog";
    }



}
