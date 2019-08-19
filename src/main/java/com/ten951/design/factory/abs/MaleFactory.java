package com.ten951.design.factory.abs;

/**
 * @author Darcy
 * @date 2019-08-19 10:53
 */
public class MaleFactory implements HumanFactory {
    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
