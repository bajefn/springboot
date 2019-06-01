package com.bjfn.springboot.config.security;

import com.bjfn.springboot.entity.SysRole;
import com.bjfn.springboot.entity.SysUser;
import com.bjfn.springboot.entity.SysUserRole;
import com.bjfn.springboot.service.SysRoleService;
import com.bjfn.springboot.service.SysUserRoleService;
import com.bjfn.springboot.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysUserRoleService sysUserRoleService;

    @Autowired
    private SysRoleService sysRoleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        //从数据库取出用户，根据用户名
        SysUser sysUser = sysUserService.selectByName(username);

        if(sysUser == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        //添加权限
        List<SysUserRole> sysUserRoles = sysUserRoleService.listByUserId(sysUser.getId());
        for (SysUserRole sysUserRole: sysUserRoles) {
            SysRole sysRole = sysRoleService.selectById(sysUserRole.getRoleId());
            authorities.add(new SimpleGrantedAuthority(sysRole.getName()));
        }
        // 返回UserDetails实现类
        return new User(sysUser.getName(),sysUser.getPassword(),authorities);
    }
}
