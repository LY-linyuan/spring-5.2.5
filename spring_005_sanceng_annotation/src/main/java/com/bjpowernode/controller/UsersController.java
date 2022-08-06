package com.bjpowernode.controller;

import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.UsersService;
import com.bjpowernode.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @Author 临渊
 * @Date 2022-08-06 11:33
 */

@Controller
public class UsersController {

    @Autowired
    UsersService usersService;

    public int insert(Users user){
        return usersService.insert(user);
    }

    public UsersService getUsersService() {
        return usersService;
    }

    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }
}
