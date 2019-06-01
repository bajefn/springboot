package com.bjfn.springboot.mapper;

import com.bjfn.springboot.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserRoleMapper {
    List<SysUserRole> listByUserId(Integer userId);
}
