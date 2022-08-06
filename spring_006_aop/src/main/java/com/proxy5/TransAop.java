package com.proxy5;

import com.proxy5.AOP;

/**
 * @Author 临渊
 * @Date 2022-08-06 14:58
 */
public class TransAop implements AOP {
    @Override
    public void before() {
        System.out.println("事务开启");
    }

    @Override
    public void after() {
        System.out.println("事务提交");
    }

    @Override
    public void exception() {
        System.out.println("事务回滚");
    }
}
