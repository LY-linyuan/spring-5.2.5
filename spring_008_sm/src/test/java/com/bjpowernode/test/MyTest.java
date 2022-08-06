package com.bjpowernode.test;

import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-08-06 21:22
 */

public class MyTest {
    @Test
    public void testUsers() {
        String config = "applicationContext_Service.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        UsersService usersService = (UsersService) applicationContext.getBean("usersServiceImpl");

        Users users = new Users();
        users.setUsername("abcdeffff");
        users.setBirthday("2022-11-11");
        users.setSex(1);
        users.setAddress("西安");

        int num = usersService.insert(users);
        System.out.println(num);
    }

    @Test
    public void testTrans() {
        String config = "applicationContext_trans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        UsersService usersService = (UsersService) applicationContext.getBean("usersServiceImpl");

        Users users = new Users();
        users.setUsername("abcdeffff");
        users.setBirthday("2022-11-11");
        users.setSex(1);
        users.setAddress("西安l");

        int num = usersService.insert(users);
        System.out.println(num);
    }
}
