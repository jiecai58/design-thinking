package com.ten951.design.factory.method;

/**
 * @author Darcy
 * @date 2019-08-19 09:34
 */
public class BlackHuman implements Human {
    @Override
    public String getColor() {
        System.out.println("肤色黑");
        return "black";
    }

    @Override
    public void talk() {
        System.out.println("肤色: " + this.getColor() + "说话了");
    }
}
