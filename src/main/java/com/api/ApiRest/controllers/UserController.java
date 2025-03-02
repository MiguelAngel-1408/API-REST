package com.api.ApiRest.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ApiRest.models.User;
import com.api.ApiRest.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    // Injecting the service
    @Autowired
    private UserService userService;


    // Method to get all users
    @GetMapping
    public ArrayList<User> getUsers() {
        return userService.getUsers();
    }

    // Method to save a user
    @PostMapping
    public User saveUser(User user) {
        return userService.saveUser(user);
    }



    
    
}
