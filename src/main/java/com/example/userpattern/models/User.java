package com.example.userpattern.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Table(name = "tb-users")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
