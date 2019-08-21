package com.ten951.design.observer;

/**
 * @author Darcy
 * @date 2019-08-21 16:05
 */
public class ConcreteSubject extends AbstractSubject {

    @Override
    public void doSomeThing() {
        System.out.println("自己业务逻辑处理完成了");
        super.notifyObservers();
    }
}
