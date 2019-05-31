package com.bjfn.springboot.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer userId;
    private String userName;
    private String password;
    private Date createDate;
    private Date updateDate;
    private Integer state;
}
