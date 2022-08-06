package com.bjpowernode;

import com.bjpowernode.s01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-08-06 17:20
 */
public class MyTest01 {
    @Test
    public void test01() {
        String config = "s01/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) applicationContext.getBean("someServiceImpl");
        String s = someService.doSome("张三", 2000000);
        System.out.println(s);
    }

    @Test
    public void test02() {
        String config = "s01/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) applicationContext.getBean("someServiceImpl");
        someService.show();
        System.out.println(someService.getClass().getName());
    }
}
