package com.bjpowernode.s04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author 临渊
 * @Date 2022-08-06 17:11
 */

@Aspect
@Component
public class MyAspect {

    @After(value = "mycut()")
    public void myAfter() {
        System.out.println("最终通知");
    }

    @Before(value = "mycut()")
    public void myBefore() {
        System.out.println("前置通知");
    }

    @Before(value = "mycut()")
    public void myBefore2() {
        System.out.println("前置通知2");
    }

    @AfterReturning(value = "mycut()", returning = "obj")
    public void myAfterReturning(Object obj) {
        System.out.println("后置通知 " + obj);
    }

    @Around(value = "execution(* com.bjpowernode.s04..*.*(..))")
    public Object myArount(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("切面方法环绕通知  前置通知");
        Object object = pjp.proceed(pjp.getArgs());
        System.out.println("切面方法环绕通知  后置通知" + object);
        return object.toString().toUpperCase();
    }

    @Pointcut(value = "execution(* com.bjpowernode.s04..*.*(..))")
    public void mycut(){}
}
