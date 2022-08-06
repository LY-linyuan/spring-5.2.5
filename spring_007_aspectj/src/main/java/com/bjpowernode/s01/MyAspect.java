package com.bjpowernode.s01;

import org.aspectj.lang.JoinPoint;
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

    @Before(value = "execution(* com.bjpowernode.s01..*.*(..))")
    public  void myBefore(JoinPoint jp) {
        System.out.println("切面方法前置通知");
        System.out.println("签名" + jp.getSignature());
        System.out.println("参数Arrays.toString(jp.getArgs())" + Arrays.toString(jp.getArgs()));
        System.out.println("参数jp.getArgs()" + jp.getArgs());
        System.out.println("参数jp.getArgs()[0]" + jp.getArgs()[0]);
        System.out.println("参数jp.getArgs()[1]" + jp.getArgs()[1]);
    }
}
