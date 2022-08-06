package com.bjpowernode.s03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author 临渊
 * @Date 2022-08-06 17:11
 */

@Aspect
@Component
public class MyAspect {

    @Around(value = "execution(* com.bjpowernode.s03..*.*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("切面方法环绕通知  前置通知");
        Object object = pjp.proceed(pjp.getArgs());
        System.out.println("切面方法环绕通知  前置通知" + object);
        return object.toString().toUpperCase();
    }
}
