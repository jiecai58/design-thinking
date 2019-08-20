package com.ten951.design.handler.model;

import com.ten951.design.handler.IWomen;

import java.util.ArrayList;
import java.util.Random;

/**
 * 责任链模式优化后的
 *
 * @author Darcy
 * @date 2019-08-20 14:43
 */
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(3), "我要出去逛街"));
        }
        //定义三个请示对象
        AbstractHandler father = new Father();
        AbstractHandler husband = new Husband();
        AbstractHandler son = new Son();
        //设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : arrayList) {
            father.handleMessage(women);
        }
    }
}
