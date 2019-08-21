package com.ten951.design.observer;

import java.util.Vector;

/**
 * @author Darcy
 * @date 2019-08-21 16:02
 */
public abstract class AbstractSubject {
    private Vector<Observer> observers = new Vector<>();


    //增加一个观察者
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    //删除一个观察者
    public void delObserver(Observer o) {
        this.observers.remove(o);
    }

    //通知所有观察者
    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update();
        }
    }

    public abstract void doSomeThing();

}
