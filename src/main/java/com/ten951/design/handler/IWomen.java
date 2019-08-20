package com.ten951.design.handler;

/**
 * @author Darcy
 * @date 2019-08-20 14:17
 */
public interface IWomen {
    /**
     * 获得个人情况
     *
     * @return 情况
     */
    int getType();

    /**
     * 获得个人请示，你要干什么？出去逛街？约会?还是看电影？
     *
     * @return
     */
    String getRequest();
}
