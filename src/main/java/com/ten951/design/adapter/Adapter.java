package com.ten951.design.adapter;

/**
 * @author Darcy
 * @date 2019-08-21 10:56
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void doSomeThing() {
        adaptee.specificRequest();
        System.out.println("Adapter做的适配处理");
    }
}
