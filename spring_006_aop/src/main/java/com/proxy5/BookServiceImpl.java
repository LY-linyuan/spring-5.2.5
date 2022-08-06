package com.proxy5;

import com.proxy5.Service;

/**
 * @Author 临渊
 * @Date 2022-08-06 14:34
 */
public class BookServiceImpl implements Service {
    @Override
    public void buy() {
        System.out.println("图书购买业务功能实现");
    }

    @Override
    public String show(int age) {
        System.out.println("这是show方法 " + age);
        return "abcd";
    }
}
