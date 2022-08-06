package com.bjpowernode;

import com.bjpowernode.s04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-08-06 17:20
 */
public class MyTest04 {
    @Test
    public void test01() {
        String config = "s04/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) applicationContext.getBean("someServiceImpl");
        String s = someService.doSome("张三", 2000000);
        System.out.println(s);
    }

    /**
     *      切面方法环绕通知  前置通知
     *      前置通知
     *      前置通知2
     *      doSome 业务功能的实现=====张三2000000
     *      切面方法环绕通知  后置通知abcd
     *      最终通知
     *      后置通知 ABCD
     *      ABCD
     */
    @Test
    public void test02() {
        String config = "s04/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) applicationContext.getBean("someServiceImpl");
        String s = someService.doSome("张三", 2000000);
        System.out.println(s);
    }

}
