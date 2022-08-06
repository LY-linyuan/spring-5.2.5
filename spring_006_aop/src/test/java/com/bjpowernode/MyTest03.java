package com.bjpowernode;

import com.proxy2.SubBookServiceImpl;
import com.proxy3.Agent;
import com.proxy3.BookServiceImpl;
import com.proxy3.ProductServiceImpl;
import com.proxy3.Service;
import org.junit.Test;

/**
 * @Author 临渊
 * @Date 2022-08-06 14:30
 */
public class MyTest03 {
    @Test
    public void  test02() {
        Service agent = new Agent(new BookServiceImpl());
        agent.buy();

        Service agent1 = new Agent(new ProductServiceImpl());
        agent1.buy();
    }
}
