package com.springboot.entity;

import java.io.Serializable;

public class SysUserRole implements Serializable{
    static final long serialVersionUID = 1L;
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    private Integer roleId;
}
