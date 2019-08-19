package com.ten951.design.proxy;

import org.springframework.cglib.proxy.InvocationHandler;

/**
 * @author Darcy
 * @date 2019-08-19 17:36
 */
public class SubjectDynamicProxy extends DynamicProxy {

    public static Object newProxyInstance(Subject subject) {
        //获得ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();
        //获得接口数组
        Class<?>[] classes = subject.getClass().getInterfaces();
        //获得handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }

}
