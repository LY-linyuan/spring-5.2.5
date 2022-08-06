package com.bjpowernode.s01;

import com.bjpowernode.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-08-06 10:13
 */
public class MyTest {
    @Test
    public void testStudent() {
        // 程序员创建对象
        Student student = new Student();
        student.setName("李四");
        student.setAge(800);
        System.out.println(student);

    }

    @Test
    public void testStudentSpring() {
        String config = "s01/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);

        Student student1 = (Student) applicationContext.getBean("student1");
        System.out.println(student1);
    }
}
