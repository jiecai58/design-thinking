package com.ten951.design.single;

/**
 * 饿汉模式
 *
 * @author Darcy
 * @date 2019-08-17 16:39
 */
public class HungryModel {
    private static final HungryModel HUNGRY_MODEL = new HungryModel();

    private HungryModel() {
    }

    public static HungryModel getInstance() {
        return HUNGRY_MODEL;
    }
}
