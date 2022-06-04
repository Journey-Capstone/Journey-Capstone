package com.journey.journeycapstone.controllers;

import com.journey.journeycapstone.models.User;
import com.journey.journeycapstone.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Properties;


@Controller
public class UserController {
    private UserRepository userDao;

    //Added this constructor
    // needed this to be added.
    public UserController(UserRepository userDao){
        this.userDao = userDao;
    }


    @GetMapping("/profile")
    public String profile(){
        return "users/profile";
    }


    @GetMapping("/register")
    public String registerForm(Model model){
        model.addAttribute("user", new User());
        return "users/register";
    }

    @PostMapping("/register")
    public String registerSubmit(@ModelAttribute User user, Model model){
        // This is what was added to get it to work
        // needed to save the user with the userDoa
        User userNew = userDao.save(user);
        // Calling the new variable to be added
        model.addAttribute("user", userNew);
        return "redirect:/login";
    }




    //When to start hashing.. --> wait until deployment

//    @PostMapping("/register")
//    public String saveUser(@ModelAttribute User user){
//        String hash = passwordEncoder.encode(user.getPassword());
//        user.setPassword(hash);
//        userDao.save(user);
//        return "redirect/login";
//    }






}
