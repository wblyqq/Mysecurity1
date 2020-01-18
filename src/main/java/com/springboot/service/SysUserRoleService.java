package com.springboot.service;

import com.springboot.Mapper.SysUserRoleMapper;
import com.springboot.entity.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserRoleService {
    @SuppressWarnings("ALL")
    @Autowired
    private SysUserRoleMapper userRoleMapper;
    public List<SysUserRole> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }
}