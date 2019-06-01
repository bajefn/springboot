package com.bjfn.springboot.mapper;

import com.bjfn.springboot.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface SysUserMapper {
    SysUser selectById(Integer id);

    SysUser selectByName(String name);
}
