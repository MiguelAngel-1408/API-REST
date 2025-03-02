package com.api.ApiRest.models;

// Importing necessary JPA annotations for entity mapping
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Defining the class as a JPA entity to map it to a database table
@Entity
public class User {

    // Primary key attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates unique IDs for each user
    private Long id;

    // Name column with a max length of 100 and cannot be null
    @Column(nullable = false, length = 100)
    private String name;

    // Gender column with a max length of 7 and cannot be null
    @Column(nullable = false, length = 7)
    private String gender;

    // Email column with a max length of 100 and cannot be null
    @Column(nullable = false, length = 100)
    private String email;

    // Getters and Setters for accessing and modifying the attributes

    // Returns the user's ID
    public Long getId() {
        return id;
    }

    // Returns the user's name
    public String getName() {
        return name;
    }

    // Returns the user's gender
    public String getGender() {
        return gender;
    }

    // Returns the user's email
    public String getEmail() {
        return email;
    }

    // Sets a new ID for the user
    public void setId(Long id) {
        this.id = id;
    }

    // Sets a new name for the user
    public void setName(String name) {
        this.name = name;
    }

    // Sets a new gender for the user
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Sets a new email for the user
    public void setEmail(String email) {
        this.email = email;
    }

}
