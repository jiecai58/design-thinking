package com.ten951.design.builder;

/**
 * @author Darcy
 * @date 2019-08-19 14:16
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        BenzModel aBenzModel = director.getABenzModel();
        aBenzModel.run();
        BMWModel dbmwModel = director.getDBMWModel();
        dbmwModel.run();
    }
}
