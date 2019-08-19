package com.ten951.design.builder;

import java.util.ArrayList;

/**
 * @author Darcy
 * @date 2019-08-19 13:59
 */
public abstract class AbstractCarModel {
    private ArrayList<String> sequence = new ArrayList<>();

    //模型是启动开始跑了
    protected abstract void start();

    //能发动，还要能停下来，那才是真本事
    protected abstract void stop();

    //喇叭会出声音，是滴滴叫，还是哔哔叫
    protected abstract void alarm();

    //引擎会轰隆隆地响，不响那是假的
    protected abstract void engineBoom();

    //那模型应该会跑吧，别管是人推的，还是电力驱动，总之要会跑
    public final void run() {
        //循环一边，谁在前，就先执行谁
        for (String actionName : this.sequence) {
            if (actionName.equalsIgnoreCase("start")) {
                this.start();  //启动汽车
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop(); //停止汽车
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm(); //喇叭开始叫了
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                //如果是engine boom关键字
                this.engineBoom();  //引擎开始轰鸣
            }
        }
    }

    //把传递过来的值传递到类内
    public final void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}