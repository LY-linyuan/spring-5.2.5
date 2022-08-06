package com.bjpowernode.s02;

import com.bjpowernode.pojo2.Student;
import com.bjpowernode.pojo2.School;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-08-06 10:13
 */
public class MyTest {
    @Test
    public void testSchool() {
        // 程序员创建对象
        String config = "s02/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        School school = (School) applicationContext.getBean("school");
        System.out.println(school);

        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }

}
