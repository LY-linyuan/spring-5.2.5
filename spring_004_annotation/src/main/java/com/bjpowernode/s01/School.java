package com.bjpowernode.s01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author 临渊
 * @Date 2022-08-06 10:28
 */

@Component
public class School {
    @Value("西安交大")
    private String name;
    @Value("西安")
    private String address;

    public School() {
        System.out.println("学校无参属构造方法");
    }

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
