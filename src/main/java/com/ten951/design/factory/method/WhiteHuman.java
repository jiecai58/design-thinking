package com.ten951.design.factory.method;

/**
 * @author Darcy
 * @date 2019-08-19 09:33
 */
public class WhiteHuman implements Human {
    @Override
    public String getColor() {
        System.out.println("white");
        return "white";
    }

    @Override
    public void talk() {
        System.out.println("肤色: " + this.getColor() + "说话了");
    }
}
