package com.example.userpattern.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

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
