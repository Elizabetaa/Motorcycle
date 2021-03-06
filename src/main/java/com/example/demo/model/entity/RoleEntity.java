package com.example.demo.model.entity;

import com.example.demo.model.entity.enums.RoleNameEnum;

import javax.persistence.*;

@Entity
@Table
public class RoleEntity extends BaseEntity {
    private RoleNameEnum role;

    public RoleEntity() {
    }

    @Enumerated(value = EnumType.STRING)
    public RoleNameEnum getRole() {
        return role;
    }

    public RoleEntity setRole(RoleNameEnum role) {
        this.role = role;
        return this;
    }
}
