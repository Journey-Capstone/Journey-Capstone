package com.journey.journeycapstone.controllers;

import com.journey.journeycapstone.models.User;
import com.journey.journeycapstone.repositories.ReviewRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class ReviewController {
    private final ReviewRepository reviewDao;

    public ReviewController(ReviewRepository reviewDao) {
        this.reviewDao = reviewDao;
    }

    @GetMapping("/reviews")
    public String allReviews(Model model){
        model.addAttribute("reviews", reviewDao.findAll());
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user",user);
        return "reviews/reviews";
    }



//@GetMapping
//    public String allAds(Model model){
//        model.addAttribute("ads", adDao.findAll());
//        return "ads/index";
//    }

}
