package com.journey.journeycapstone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReviewController {

    @GetMapping("/reviews")
    public String reviews(){
        return "reviews/reviews";
    }
}
