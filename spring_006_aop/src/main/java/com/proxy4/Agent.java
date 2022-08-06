package com.proxy4;

/**
 * @Author 临渊
 * @Date 2022-08-06 15:00
 */
public class Agent implements Service{

    Service target;
    AOP aop;

    public Agent (Service target, AOP aop) {
        this.aop = aop;
        this.target = target;
    }

    @Override
    public void buy() {
        try {
            aop.before();
            target.buy();
            aop.after();
        } catch (Exception e) {
            aop.exception();
        }
    }
}
