package com.ten951.design.factory.abs;

/**
 * @author Darcy
 * @date 2019-08-19 11:00
 */
public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}
