package com.ten951.design.factory.abs;

/**
 * @author Darcy
 * @date 2019-08-19 10:46
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色");
    }

    @Override
    public void talk() {
        System.out.println("黑色说话");
    }


}
