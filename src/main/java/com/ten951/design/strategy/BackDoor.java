package com.ten951.design.strategy;

/**
 * @author Darcy
 * @date 2019-08-20 22:27
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("锦囊1....");
    }
}
