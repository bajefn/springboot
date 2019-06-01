package com.bjfn.springboot.mapper;

import com.bjfn.springboot.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRoleMapper {
    SysRole selectById(Integer id);
}
