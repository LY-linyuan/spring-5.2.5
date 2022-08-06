package com.proxy5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author 临渊
 * @Date 2022-08-06 15:13
 */
public class ProxyFactory {

    public static Object getAgent(Service target, AOP aop) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy,
                                         Method method,
                                         Object[] args) throws Throwable {
                            Object obj = null;
                        try {
                            aop.before();
                            obj = method.invoke(target, args);
                            aop.after();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return obj;
                    }
                });
    }
}
