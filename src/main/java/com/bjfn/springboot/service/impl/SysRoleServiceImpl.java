package com.bjfn.springboot.service.impl;

import com.bjfn.springboot.entity.SysRole;
import com.bjfn.springboot.mapper.SysRoleMapper;
import com.bjfn.springboot.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;


    @Override
    public SysRole selectById(Integer id) {
        return sysRoleMapper.selectById(id);
    }
}
