package com.ten951.design.proxy;

/**
 * @author Darcy
 * @date 2019-08-19 17:31
 */
public class RealSubject implements Subject {
    @Override
    public void doSomeThing(String string) {
        System.out.println("do something!---->" + string);
    }
}
