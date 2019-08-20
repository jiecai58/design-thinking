package com.ten951.design.strategy;

/**
 * 封装角色
 * @author Darcy
 * @date 2019-08-20 22:29
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
