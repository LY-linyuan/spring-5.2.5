package com.bjpowernode.pojo;

import com.bjpowernode.pojo2.School;

/**
 * @Author 临渊
 * @Date 2022-08-06 10:11
 */
public class Student {
    private String name;
    private int age;
    private School school;

    public Student() {
        System.out.println("学生无参属构造方法");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
