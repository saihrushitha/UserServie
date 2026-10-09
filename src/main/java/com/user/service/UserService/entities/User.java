package com.user.service.UserService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    private String userId;
    private String name;
    private String email;
    private String about;

    public void setUserId(String userId) {
        this.userId = userId;
    }
    @Transient
    private List<Rating> ratings=new ArrayList<>();
}
