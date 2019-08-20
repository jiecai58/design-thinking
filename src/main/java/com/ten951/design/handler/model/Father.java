package com.ten951.design.handler.model;

import com.ten951.design.handler.IWomen;

/**
 * @author Darcy
 * @date 2019-08-20 14:39
 */
public class Father extends AbstractHandler {

    /**
     * 每个类都要说明一下自己能处理哪些请求
     *
     */
    public Father() {
        super(AbstractHandler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
