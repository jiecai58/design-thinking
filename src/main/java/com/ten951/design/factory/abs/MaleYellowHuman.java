package com.ten951.design.factory.abs;

/**
 * @author Darcy
 * @date 2019-08-19 11:00
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
