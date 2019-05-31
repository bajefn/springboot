package com.bjfn.springboot.mapper;

import com.bjfn.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> getUser();
}
