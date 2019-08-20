package com.ten951.design.handler.model;

import com.ten951.design.handler.IWomen;

/**
 * @author Darcy
 * @date 2019-08-20 14:41
 */
public class Son extends AbstractHandler {

    /**
     * 每个类都要说明一下自己能处理哪些请求
     */
    public Son() {
        super(AbstractHandler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
}
