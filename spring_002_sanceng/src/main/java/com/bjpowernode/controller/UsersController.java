package com.bjpowernode.controller;

import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.UsersService;
import com.bjpowernode.service.impl.UsersServiceImpl;

/**
 * @Author 临渊
 * @Date 2022-08-06 11:33
 */
public class UsersController {
    UsersService usersService = new UsersServiceImpl();

    public int insert(Users user){
        return usersService.insert(user);
    }
}
