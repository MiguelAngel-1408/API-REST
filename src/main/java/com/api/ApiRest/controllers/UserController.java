package com.api.ApiRest.controllers;

// Importing necessary libraries for REST controllers and dependency injection
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

// Marks this class as a REST controller that handles HTTP requests for /users endpoint
@RestController
@RequestMapping("/users")
public class UserController {

    // Injecting the UserService to manage business logic for User entity
    @Autowired
    private UserService userService;

    // Handles GET requests to /users to retrieve a list of all users
    @GetMapping
    public ArrayList<User> getUsers() {
        return userService.getUsers(); // Calls service to fetch all users
    }

    // Handles POST requests to /users to create a new user
    // @RequestBody maps the request body to a User object
    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user); // Calls service to save the user
    }

    // Handles DELETE requests to /users/{id} to remove a user by their ID
    // @PathVariable extracts the user ID from the URL
    @DeleteMapping(path = "/{id}")
    public String deleteUserById(@PathVariable("id") Long id) {
        boolean ok = this.userService.deleteUserById(id); // Calls service to delete the user
        if (ok) {
            return "User deleted successfully with ID: " + id; // Success message
        } else {
            return "User not found with ID: " + id; // Error message if user doesn't exist
        }
    }
}
