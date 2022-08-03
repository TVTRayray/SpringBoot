package org.example.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Role {
    private Long id;
    private String roleName;
    private String roleDesc;
}
