package com.example.userpattern.controllers;

import com.example.userpattern.models.User;
import com.example.userpattern.repositories.UserRepository;
import com.example.userpattern.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    public Optional<User> findUserById(UUID id) {
        return userService.findUserByID(id);
    }

}
