package com.ten951.design.factory.method;

/**
 * @author Darcy
 * @date 2019-08-19 09:36
 */
public class YellowHuman implements Human {
    @Override
    public String getColor() {
        System.out.println("肤色黄");
        return "yellow";
    }

    @Override
    public void talk() {
        System.out.println("肤色: " + this.getColor() + "说话了");
    }
}
