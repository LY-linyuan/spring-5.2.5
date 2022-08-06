package com.proxy4;

/**
 * @Author 临渊
 * @Date 2022-08-06 14:57
 */
public class LogAop implements AOP{
    @Override
    public void before() {
        System.out.println("前置日志输出");
    }
}
