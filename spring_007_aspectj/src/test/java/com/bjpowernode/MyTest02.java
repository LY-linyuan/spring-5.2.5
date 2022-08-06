package com.bjpowernode;

import com.bjpowernode.s02.SomeService;
import com.bjpowernode.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-08-06 17:20
 */
public class MyTest02 {
    @Test
    public void test01() {
        String config = "s02/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) applicationContext.getBean("someServiceImpl");
        String s = someService.doSome("张三", 2000000);
        System.out.println(s);
    }

    @Test
    public void test0() {
        String config = "s02/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) applicationContext.getBean("someServiceImpl");
        Student change = someService.change();
        System.out.println(change);
    }

}
