package com.bjpowernode.s04;

import org.springframework.stereotype.Service;

/**
 * @Author 临渊
 * @Date 2022-08-06 17:10
 */

@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome 业务功能的实现=====" + name + age);
        return "abcd";
    }

}
