package com.example.userpattern.models;

import lombok.*;

@NoArgsConstructor
@Builder
@Getter
@Setter
@AllArgsConstructor
public class AuthenticationRequest {
    private String username;
    private String password;
}
