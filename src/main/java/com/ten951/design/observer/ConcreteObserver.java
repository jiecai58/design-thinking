package com.ten951.design.observer;

/**
 * @author Darcy
 * @date 2019-08-21 16:07
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("观察者执行了");
    }
}
