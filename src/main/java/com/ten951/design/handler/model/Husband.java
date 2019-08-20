package com.ten951.design.handler.model;

import com.ten951.design.handler.IWomen;

/**
 * @author Darcy
 * @date 2019-08-20 14:40
 */
public class Husband extends AbstractHandler {
    /**
     * 每个类都要说明一下自己能处理哪些请求
     *
     */
    public Husband() {
        super(AbstractHandler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是：同意\n");
    }
}
