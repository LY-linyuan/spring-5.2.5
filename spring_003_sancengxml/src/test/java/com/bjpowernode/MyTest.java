package com.bjpowernode;

import com.bjpowernode.controller.UsersController;
import com.bjpowernode.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-08-06 11:36
 */
public class MyTest {
    @Test
    public void testInsertUsers() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Users user = (Users) applicationContext.getBean("user");
        UsersController uController = (UsersController) applicationContext.getBean("uController");
        int num = uController.insert(user);
        System.out.println(num);
    }

    @Test
    public void testTotal() {
        String config = "total.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Users user = new Users(2,"张三三", 200);
        UsersController uController = (UsersController) applicationContext.getBean("uController");
        int num = uController.insert(user);
        System.out.println(num);
    }
}
