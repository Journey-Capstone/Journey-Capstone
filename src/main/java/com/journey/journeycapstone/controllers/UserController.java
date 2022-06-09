package com.journey.journeycapstone.controllers;

import com.journey.journeycapstone.models.User;
import com.journey.journeycapstone.repositories.ReviewRepository;
import com.journey.journeycapstone.repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Properties;

@Controller
public class UserController {
    private UserRepository userDao;
    private ReviewRepository reviewDao;
    private PasswordEncoder passwordEncoder;

    public UserController(UserRepository userDao, PasswordEncoder passwordEncoder,ReviewRepository reviewDao) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
        this.reviewDao = reviewDao;
    }

    @GetMapping("/register")
    public String showSignupForm(Model model){
        model.addAttribute("user", new User());
        return "users/register";
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute User user){
        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);

        userDao.save(user);
        return "redirect:/login";
    }
//    @GetMapping("/profile")
//    public String profile(){
//        return "users/profile";
//    }

    @GetMapping("/profile")
    public String profile(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("reviews", reviewDao.findAllByUser(user));
        model.addAttribute("user",user);
        model.addAttribute("loggedInUser",user);
        return "users/profile";
    }

    @GetMapping("/profile/{name}")
    public String usersProfile(@PathVariable String name, Model model){
        User user = userDao.findByUsername(name);
        User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();


        model.addAttribute("user",user);
        model.addAttribute("loggedInUser",loggedInUser);
        model.addAttribute("reviews", reviewDao.findAllByUser(user));
        return "users/profile";
    }
}




    //When to start hashing.. --> wait until deployment

//    @PostMapping("/register")
//    public String saveUser(@ModelAttribute User user){
//        String hash = passwordEncoder.encode(user.getPassword());
//        user.setPassword(hash);
//        userDao.save(user);
//        return "redirect/login";
//    }









