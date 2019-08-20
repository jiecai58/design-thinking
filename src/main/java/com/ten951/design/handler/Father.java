package com.ten951.design.handler;

/**
 * @author Darcy
 * @date 2019-08-20 14:23
 */
public class Father implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
