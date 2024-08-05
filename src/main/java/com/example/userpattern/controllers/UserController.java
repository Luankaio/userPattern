package com.example.userpattern.controllers;
import com.example.userpattern.dtos.UserDTO;
import com.example.userpattern.models.User;
import com.example.userpattern.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/User")
public class UserController {


    final private UserService userService;

        public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(UserDTO userDTO) {
        return ResponseEntity.ok(userService.createUser(userDTO));
    }

    @GetMapping
    public Optional<User> findUserById(UUID id) {
        return userService.findUserByID(id);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam UUID id){
        userService.deleteUserByID(id);
    }

}
