package com.bjfn.springboot.service.impl;

import com.bjfn.springboot.entity.SysUserRole;
import com.bjfn.springboot.mapper.SysUserRoleMapper;
import com.bjfn.springboot.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public List<SysUserRole> listByUserId(Integer userId) {
        return sysUserRoleMapper.listByUserId(userId);
    }
}
