package com.bjpowernode.s02;

import com.bjpowernode.s02.Student;
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
        String config = "s02/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("stu");
        System.out.println(student);
    }
}
