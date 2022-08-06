package com.bjpowernode;

import com.bjpowernode.controller.UsersController;
import com.bjpowernode.pojo.Users;
import org.junit.Test;

/**
 * @Author 临渊
 * @Date 2022-08-06 11:36
 */
public class MyTest {
    @Test
    public void testInsertUsers() {
        UsersController usersController = new UsersController();
        int num = usersController.insert(new Users(100, "张三", 22));
        System.out.println(num);
    }
}
