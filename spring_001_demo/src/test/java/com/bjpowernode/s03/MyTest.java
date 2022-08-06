package com.bjpowernode.s03;

import com.bjpowernode.pojo03.School;
import com.bjpowernode.pojo03.Student;
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
        String config = "s03/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);

        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }

}
