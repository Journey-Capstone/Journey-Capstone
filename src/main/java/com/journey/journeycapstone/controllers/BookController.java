package com.journey.journeycapstone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class BookController {

    @GetMapping("/main")
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
