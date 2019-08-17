package com.ten951.design.single;

/**
 * 懒汉模式
 *
 * @author Darcy
 * @date 2019-08-17 16:34
 */
public class LazyModel {

    private static LazyModel lazyModel;

    private LazyModel() {

    }

    public static synchronized LazyModel getInstance() {
        if (lazyModel == null) {
            lazyModel = new LazyModel();
        }
        return lazyModel;
    }
}
