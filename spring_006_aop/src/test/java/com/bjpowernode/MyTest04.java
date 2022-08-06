package com.bjpowernode;


import com.proxy4.*;
import org.junit.Test;

/**
 * @Author 临渊
 * @Date 2022-08-06 14:30
 */
public class MyTest04 {
    @Test
    public void  test04() {
        Service agent = new Agent(new BookServiceImpl(), new TransAop());
        agent.buy();
        System.out.println("===========");
        Service agent1 = new Agent(agent, new LogAop());
        agent1.buy();
    }
}
