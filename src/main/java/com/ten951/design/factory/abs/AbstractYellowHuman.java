package com.ten951.design.factory.abs;

/**
 * @author Darcy
 * @date 2019-08-19 10:46
 */
public abstract class AbstractYellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄色");
    }

    @Override
    public void talk() {
        System.out.println("黄色说话");
    }
}
