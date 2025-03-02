package com.api.ApiRest.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }


    // Method to delete a user by id
    @DeleteMapping(path = "/{id}")
    public String deleteUserById(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUserById(id);
        if(ok){
            return "User deleted with id: " + id;
        }else{
            return "User not found";
        }
    }
}
