package com.ten951.design.factory.abs;

/**
 * @author Darcy
 * @date 2019-08-19 10:52
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
