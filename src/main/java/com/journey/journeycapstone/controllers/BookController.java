package com.journey.journeycapstone.controllers;

import com.journey.journeycapstone.models.Review;
import com.journey.journeycapstone.models.User;
import com.journey.journeycapstone.repositories.ReviewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class BookController {
    private ReviewRepository reviewDao;

    public BookController(ReviewRepository reviewDao){
        this.reviewDao = reviewDao;
    }


    @GetMapping("/main")
    public String mainPage(){
        return "main/main";
    }

//    @GetMapping("/books")
//    public String singleBook(){
//        return "main/singleBook";
//    }

    //review form
    @GetMapping("/books")
    public String reviewsForm(Model model){
        model.addAttribute("review", new Review());
        return "main/singleBook";
    }
    @PostMapping("/books")
    public String reviewsSubmit(@ModelAttribute Review review, Model model){
        // This is what was added to get it to work
        // needed to save the user with the userDoa
        Review newReview = reviewDao.save(review);
        // Calling the new variable to be added
        model.addAttribute("review", newReview);
        return "redirect:/books";
    }
    //review form



    @GetMapping("/catalog")
    public String catalogPage(){
        return "main/catalog";
    }



}
