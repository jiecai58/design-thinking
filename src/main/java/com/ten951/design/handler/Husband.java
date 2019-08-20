package com.ten951.design.handler;

/**
 * @author Darcy
 * @date 2019-08-20 14:24
 */
public class Husband implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("妻子的请示是：" + women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
