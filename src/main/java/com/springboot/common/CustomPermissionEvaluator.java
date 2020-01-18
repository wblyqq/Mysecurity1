package com.springboot.common;

import com.springboot.entity.SysPermission;
import com.springboot.service.SysPermissionService;
import com.springboot.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Component
public class CustomPermissionEvaluator implements PermissionEvaluator {
    @Autowired
    private SysPermissionService permissionService;
    @Autowired
    private SysRoleService roleService;
    @Override
    public boolean hasPermission(Authentication authentication, Object targetUrl, Object targetPermission) {
       //获取LoadUserByName()方法的结果
        User user = (User) authentication.getPrincipal();
        //获得注入角色
        Collection<GrantedAuthority> authorities = user.getAuthorities();
        //用户所有的角色
        for(GrantedAuthority authority : authorities){
            String roleName = authority.getAuthority();
            Integer roId = roleService.selectByName(roleName).getId();
            //得到角色所有的权限
            List<SysPermission> permissionList = permissionService.listByRoleId(roId);

            //遍历permissionList
            for(SysPermission sysPermission:permissionList){
                //获取权限集
                List permissions = sysPermission.getPermissions();
                if(targetUrl.equals(sysPermission.getUrl())
                        && permissions.contains(targetPermission)) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable serializable, String s, Object o) {
        return false;
    }
}
