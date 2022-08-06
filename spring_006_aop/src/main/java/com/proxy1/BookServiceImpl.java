package com.proxy1;

/**
 * @Author 临渊
 * @Date 2022-08-06 14:25
 */
public class BookServiceImpl {
    public void buy() {
        try {
            System.out.println("事务开启");
            System.out.println("读书购买业务功能实现");
            System.out.println("事务提交");
        } catch (Exception e) {
            System.out.println("事务回滚");
        }
    }
}
