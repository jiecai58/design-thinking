package com.ten951.design.adapter;

/**
 * @author Darcy
 * @date 2019-08-21 11:03
 */
public class Client {
    public static void main(String[] args) {

        //创建需要被适配的对象
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.doSomeThing();
    }
}
