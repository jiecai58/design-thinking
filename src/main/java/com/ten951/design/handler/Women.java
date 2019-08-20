package com.ten951.design.handler;

/**
 * @author Darcy
 * @date 2019-08-20 14:18
 */
public class Women implements IWomen {

    /*
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1--未出嫁
     * 2--出嫁
     * 3--夫死
     */
    private int type;
    //妇女的请示
    private String request;

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    //获得自己的状况
    @Override
    public int getType() {
        return this.type;
    }

    //获得妇女的请求
    @Override
    public String getRequest() {
        return this.request;
    }
}
