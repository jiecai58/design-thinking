package com.ten951.design.clone;

import java.util.ArrayList;

/**
 * @author Darcy
 * @date 2019-08-19 19:11
 */
public class Client {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("张三");
        thing.setName("dddddd");
        thing.setInteger(2);
        /*浅拷贝*/
        Thing clone = thing.clone();
        ArrayList value = clone.getValue();
        String name = clone.getName();
        Integer integer = clone.getInteger();
        /**/
        clone.setValue("李四");
        System.out.println("value = " + thing.getValue());
        System.out.println("clone = " + clone.getValue());
        /*深拷贝*/
        Thing thing1 = clone.deepenClone();
        thing1.setInteger(3);
        thing1.setValue("解决");
        System.out.println("clone = " + clone.getValue());
        System.out.println("thing1 = " + thing1.getValue());


    }
}
