package com.springboot.service;

import com.springboot.Mapper.SysUserMapper;
import com.springboot.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {
    @SuppressWarnings("ALL")
    @Autowired
    private SysUserMapper userMapper;
    public SysUser selectById(Integer id) {
        return userMapper.selectById(id);
    }
    public SysUser selectByName(String name) {
        return userMapper.selectByName(name);
    }
}