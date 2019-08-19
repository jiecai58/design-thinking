package com.ten951.design.proxy;

/**
 * @author Darcy
 * @date 2019-08-19 17:38
 */
public class DynamicClient {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        MyInvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = (Subject) DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.doSomeThing("ss");

        Subject proxyInstance = (Subject)SubjectDynamicProxy.newProxyInstance(subject);
        proxyInstance.doSomeThing("SSSSSSS");


    }
}
