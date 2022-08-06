package com.bjpowernode;

import com.proxy5.*;
import org.junit.Test;

/**
 * @Author 临渊
 * @Date 2022-08-06 14:30
 */
public class MyTest05 {
    @Test
    public void  test05() {
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImpl(), new TransAop());
        // agent.buy();
    }

    @Test
    public void  test05_02() {
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImpl(), new TransAop());
        String show = agent.show(20);
        System.out.println(show);
    }
}
