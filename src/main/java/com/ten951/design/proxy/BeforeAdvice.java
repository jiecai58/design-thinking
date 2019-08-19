package com.ten951.design.proxy;

/**
 * @author Darcy
 * @date 2019-08-19 17:36
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
