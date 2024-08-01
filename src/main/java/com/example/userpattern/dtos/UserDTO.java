    package com.example.userpattern.dtos;


import javax.validation.constraints.*;
import lombok.*;

@AllArgsConstructor
public class UserDTO {

    @NotEmpty
    private String name;

    @NotEmpty
    private String email;

    @NotEmpty
    @Size(min = 8, message = "Password must be at least 8 characters long")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-zA-Z]).*$")
    private String password;

}

