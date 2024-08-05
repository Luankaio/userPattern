package com.example.userpattern.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Table(name = "tb_users")
@NoArgsConstructor
@Builder
@Getter
@Setter
@AllArgsConstructor
@jakarta.persistence.Entity
public class User {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String name;

    @Column(unique = true)
    private String email;

    @JsonIgnore
    private String password;

    private Date createdAT;
    private Date updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAT = new Date();
        this.updatedAt = new Date();
    }

}
