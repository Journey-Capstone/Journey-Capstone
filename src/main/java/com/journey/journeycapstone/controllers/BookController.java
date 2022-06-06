package com.journey.journeycapstone.controllers;

import com.journey.journeycapstone.models.Review;
import com.journey.journeycapstone.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
