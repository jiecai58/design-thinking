package com.ten951.design.factory.abs;

/**
 * @author Darcy
 * @date 2019-08-19 11:02
 */
public class NvWa {
    public static void main(String[] args) {
        HumanFactory female = new FemaleFactory();
        HumanFactory male = new MaleFactory();
        Human blackHuman = female.createBlackHuman();
        blackHuman.getColor();
        blackHuman.getSex();
        blackHuman.talk();

        Human blackHuman1 = male.createBlackHuman();
        blackHuman1.getColor();
        blackHuman1.getSex();
        blackHuman1.talk();

    }
}
