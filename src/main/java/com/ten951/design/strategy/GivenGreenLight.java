package com.ten951.design.strategy;

/**
 * @author Darcy
 * @date 2019-08-20 22:28
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("锦囊2...");
    }
}
