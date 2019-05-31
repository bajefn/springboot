package com.bjfn.springboot.controller;

import com.bjfn.springboot.entity.User;
import com.bjfn.springboot.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    @ResponseBody
    public PageInfo<User> getUser(){
        PageHelper.startPage(0,10);
        return new PageInfo<>(userService.getUser());
    }

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("listUser",userService.getUser());
        return "hello";
    }
}
