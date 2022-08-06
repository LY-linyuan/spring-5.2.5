package com.bjpowernode.pojo2;

/**
 * @Author 临渊
 * @Date 2022-08-06 10:28
 */
public class School {
    private String name;
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
