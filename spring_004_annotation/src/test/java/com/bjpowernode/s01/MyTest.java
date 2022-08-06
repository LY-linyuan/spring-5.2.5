package com.bjpowernode.s01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-08-06 10:13
 */
public class MyTest {

    @Test
    public void test() {
        String config = "s01/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("stu");
        System.out.println(student);
    }
}
