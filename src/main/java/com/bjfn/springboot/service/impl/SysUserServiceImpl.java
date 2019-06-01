package com.bjfn.springboot.service.impl;

import com.bjfn.springboot.entity.SysUser;
import com.bjfn.springboot.mapper.SysUserMapper;
import com.bjfn.springboot.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectById(Integer id) {
        return sysUserMapper.selectById(id);
    }

    @Override
    public SysUser selectByName(String name) {
        return sysUserMapper.selectByName(name);
    }
}
