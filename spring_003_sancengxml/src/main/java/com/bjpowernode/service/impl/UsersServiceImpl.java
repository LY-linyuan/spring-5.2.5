package com.bjpowernode.service.impl;

import com.bjpowernode.dao.UsersMapper;
import com.bjpowernode.dao.UsersMapperImpl;
import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.UsersService;

/**
 * @Author 临渊
 * @Date 2022-08-06 10:54
 */
public class UsersServiceImpl implements UsersService {

    private UsersMapper usersMapper;

    @Override
    public int insert(Users user) {
        return usersMapper.insert(user);
    }

    public UsersMapper getUsersMapper() {
        return usersMapper;
    }

    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }
}
