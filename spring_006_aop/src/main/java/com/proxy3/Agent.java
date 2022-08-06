package com.proxy3;

/**
 * @Author 临渊
 * @Date 2022-08-06 14:34
 */
public class Agent implements Service{

    public Service target;

    public Agent (Service target) {
        this.target = target;
    }

    @Override
    public void buy() {
        try {
            System.out.println("事务开启");
            target.buy();
            System.out.println("提交事务");
        } catch (Exception e) {
            System.out.println("事务回滚");
        }
    }
}
