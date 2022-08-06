package com.proxy4;

import com.proxy4.Service;

/**
 * @Author 临渊
 * @Date 2022-08-06 14:34
 */
public class BookServiceImpl implements Service {
    @Override
    public void buy() {
        System.out.println("图书购买业务功能实现");
    }
}
