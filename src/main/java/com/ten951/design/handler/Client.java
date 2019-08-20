package com.ten951.design.handler;

import java.util.ArrayList;
import java.util.Random;

/**
 * 普通的编码方法
 * 大量的判断代码移到了客户端. 如果业务方做了拓展. Client还要做响应的代码修改. 明显违背了开闭原则
 * @author Darcy
 * @date 2019-08-20 14:27
 */
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        //定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        for (IWomen women : arrayList) {
            if (women.getType() == 1) { //未结婚少女，请示父亲
                System.out.println("\n--------女儿向父亲请示-------");
                father.handleMessage(women);
            } else if (women.getType() == 2) {  //已婚少妇，请示丈夫
                System.out.println("\n--------妻子向丈夫请示-------");
                husband.handleMessage(women);
            } else if (women.getType() == 3) { //母亲请示儿子
                System.out.println("\n--------母亲向儿子请示-------");
                son.handleMessage(women);
            } else {
                //暂时什么也不做
            }
        }
    }
}
