package com.bjfn.springboot.service;

import com.bjfn.springboot.entity.SysUserRole;

import java.util.List;

public interface SysUserRoleService {
    List<SysUserRole> listByUserId(Integer userId);
}
