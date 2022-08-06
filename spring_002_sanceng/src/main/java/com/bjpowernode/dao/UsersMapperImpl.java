package com.bjpowernode.dao;

import com.bjpowernode.dao.UsersMapper;
import com.bjpowernode.pojo.Users;

/**
 * @Author 临渊
 * @Date 2022-08-06 10:51
 */
public class UsersMapperImpl implements UsersMapper {
    @Override
    public int insert(Users user) {
        System.out.println(user.getUname() + "用户增加成功");
        return 1;
    }
}
