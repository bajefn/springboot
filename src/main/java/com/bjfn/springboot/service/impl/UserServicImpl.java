package com.bjfn.springboot.service.impl;

import com.bjfn.springboot.entity.User;
import com.bjfn.springboot.mapper.UserMapper;
import com.bjfn.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser() {
        return userMapper.getUser();
    }
}
