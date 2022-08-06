package com.proxy2;

/**
 * @Author 临渊
 * @Date 2022-08-06 14:28
 */
public class SubBookServiceImpl extends BookServiceImpl{


    @Override
    public void buy() {
        try {
            System.out.println("事务开启");
            super.buy();
            System.out.println("事务提交");
        } catch (Exception e) {
            System.out.println("事务回滚");
        }
    }


}
