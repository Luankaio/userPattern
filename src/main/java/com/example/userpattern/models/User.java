package com.example.userpattern.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Table(name = "tb_users")
@NoArgsConstructor
@Builder
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
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
