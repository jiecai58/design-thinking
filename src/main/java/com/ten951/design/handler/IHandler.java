package com.ten951.design.handler;

/**
 * @author Darcy
 * @date 2019-08-20 14:20
 */
public interface IHandler {

    /**
     * 一个女性（女儿、妻子或者母亲）要求逛街，你要处理这个请求
     *
     * @param women
     */
    void handleMessage(IWomen women);
}
