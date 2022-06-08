package com.journey.journeycapstone.controllers;

import com.journey.journeycapstone.models.Review;
import com.journey.journeycapstone.models.User;
import com.journey.journeycapstone.repositories.ReviewRepository;
import com.journey.journeycapstone.repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class BookController {
    private ReviewRepository reviewDao;
    private final UserRepository userDao;

    public BookController(ReviewRepository reviewDao, UserRepository userDao){
        this.reviewDao = reviewDao;
        this.userDao = userDao;
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
        User principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = principal;
        review.setUser(user);
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
