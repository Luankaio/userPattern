package com.example.userpattern.services;

import com.example.userpattern.models.User;
import com.example.userpattern.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public Optional<User> findUserByID(UUID id){
        return userRepository.findById(id);
    }
}
