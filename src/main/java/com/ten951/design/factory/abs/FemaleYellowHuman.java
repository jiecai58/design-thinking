package com.ten951.design.factory.abs;

/**
 * @author Darcy
 * @date 2019-08-19 10:58
 */
public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄色女性");
    }
}
