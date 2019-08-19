package com.ten951.design.factory.abs;

/**
 * @author Darcy
 * @date 2019-08-19 10:45
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色");
    }

    @Override
    public void talk() {
        System.out.println("白色说话");
    }
}
