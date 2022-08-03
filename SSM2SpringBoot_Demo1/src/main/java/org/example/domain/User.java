package org.example.domain;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String phoneNum;

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
