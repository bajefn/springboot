package com.bjfn.springboot.service;

import com.bjfn.springboot.entity.SysUser;

public interface SysUserService {
    SysUser selectById(Integer id);
    SysUser selectByName(String name);
}
