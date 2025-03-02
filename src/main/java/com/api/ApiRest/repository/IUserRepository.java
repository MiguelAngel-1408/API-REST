package com.api.ApiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.ApiRest.models.User;

public interface IUserRepository extends JpaRepository<User, Long> {


}