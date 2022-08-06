package com.bjpowernode;

import com.proxy2.BookServiceImpl;
import com.proxy2.SubBookServiceImpl;
import org.junit.Test;

/**
 * @Author 临渊
 * @Date 2022-08-06 14:30
 */
public class MyTest02 {
    @Test
    public void  test02() {
        BookServiceImpl bookService = new SubBookServiceImpl();
        bookService.buy();
    }
}
