package com.example.userpattern.configs;

import com.example.userpattern.configs.security.CustomUserDetailService;
import com.example.userpattern.configs.security.JwtAuthenticationFilter;
import com.example.userpattern.configs.security.JwtUtil;
import com.example.userpattern.controllers.AuthenticationController;
import com.example.userpattern.controllers.UserController;
import com.example.userpattern.repositories.UserRepository;
import com.example.userpattern.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;

@Configuration
public class BeanConfiguration {

    @Bean
    UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }

    @Bean
    JwtAuthenticationFilter jwtAuthenticationFilter(JwtUtil jwtUtil, CustomUserDetailService customUserDetailService) {
        return new JwtAuthenticationFilter(jwtUtil, customUserDetailService);
    }


}
