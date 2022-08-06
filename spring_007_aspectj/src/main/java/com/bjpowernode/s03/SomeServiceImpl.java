package com.bjpowernode.s03;

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

    @Override
    public Student change() {
        System.out.println("change方法被执行");
        return new Student("张三");
    }
}
