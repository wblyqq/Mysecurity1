package com.springboot.service;

import com.springboot.Mapper.SysPermissionMapper;
import com.springboot.entity.SysPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPermissionService {
    @SuppressWarnings("ALL")
    @Autowired
    private SysPermissionMapper sysPermissionMapper;
    /**
     * 获取指定角色所有权限
     */
    public List<SysPermission> listByRoleId(Integer roleId) {
        return sysPermissionMapper.listByRoleId(roleId);
    }

}
