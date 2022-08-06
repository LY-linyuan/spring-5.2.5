package com.proxy5;

public interface Service {
    void buy();

    default String show(int age){return null;}
}
