package com.rest.learning.restLearning.mainProject.dto;

import com.rest.learning.restLearning.mainProject.entity.type.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequestDto {
    private String username;
    private String password;
    private String name;

    public String getUsername() {
        return username;
    }

    public SignUpRequestDto() {
    }

    public SignUpRequestDto(String username, String password, String name, Set<RoleType> roles) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.roles = roles;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<RoleType> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleType> roles) {
        this.roles = roles;
    }

    private Set<RoleType> roles = new HashSet<>();
}
