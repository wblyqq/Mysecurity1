package com.springboot.service;

import com.springboot.Mapper.SysRoleMapper;
import com.springboot.entity.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleService {
    @SuppressWarnings("ALL")
    @Autowired
    private SysRoleMapper roleMapper;
    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }
    public SysRole selectByName(String name) {
        return roleMapper.selectByName(name);
    }
}