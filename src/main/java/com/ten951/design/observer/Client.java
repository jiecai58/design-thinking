package com.ten951.design.observer;


/**
 * @author Darcy
 * @date 2019-08-21 16:10
 */
public class Client {
    public static void main(String[] args) {
        AbstractSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver());
        subject.doSomeThing();


    }
}
