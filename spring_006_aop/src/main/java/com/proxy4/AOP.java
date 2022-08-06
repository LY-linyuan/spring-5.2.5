package com.proxy4;

public interface AOP {
    default void before(){}
    default void after(){}
    default void exception (){}
}
