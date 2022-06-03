package com.journey.journeycapstone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main")
public class BookController {

    @GetMapping
    @ResponseBody
    public String mainPage(){
        return "Main page";
    }

    @GetMapping("/books")
    @ResponseBody
    public String singleBook(){
        return "single book page";
    }

    @GetMapping("/catalog")
    @ResponseBody
    public String catalogPage(){
        return "this is our catalog page";
    }



}
