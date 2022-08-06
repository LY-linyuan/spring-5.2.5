package com.bjpowernode.s02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author 临渊
 * @Date 2022-08-06 17:11
 */

@Aspect
@Component
public class MyAspect {

    @AfterReturning(value = "execution(* com.bjpowernode.s02..*.*(..))", returning = "obj")
    public void myAfterReturning(Object obj) {
        System.out.println("切面方法后置通知");
        if (obj != null) {
            if (obj instanceof String) {
                obj = ((String) obj).toUpperCase();
                System.out.println("在切面方法中目标方法返回值" + obj);
            }

            if (obj instanceof Student) {
                Student student = (Student) obj;
                student.setName("张三三三三三");
                System.out.println("在切面方法中目标方法返回值" + student);
            }
        }
    }
}
