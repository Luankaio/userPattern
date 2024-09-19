package com.example.userpattern.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.PropertyValues;

import java.util.Date;
import java.util.List;
import java.util.Set;
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

    private String username;

    @Column(unique = true)
    private String email;

    @JsonIgnore
    private String password;

    @ElementCollection
    private List<String> roles;

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }



}
