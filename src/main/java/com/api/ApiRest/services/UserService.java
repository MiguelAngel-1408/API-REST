package com.api.ApiRest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ApiRest.models.User;
import com.api.ApiRest.repository.IUserRepository;

@Service
public class UserService {

    // Injecting the repository
    @Autowired
    IUserRepository userRepository;

    // Method to get all users
    public ArrayList<User> getUsers() {
        return (ArrayList<User>) userRepository.findAll();
    }

    // Method to save a user
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    

}
