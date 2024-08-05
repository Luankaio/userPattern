package com.example.userpattern.configs;

import com.example.userpattern.controllers.UserController;
import com.example.userpattern.repositories.UserRepository;
import com.example.userpattern.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }

}
