package com.ten951.design.command;

/**
 * @author Darcy
 * @date 2019-08-20 10:26
 */
public class PageGroup implements Group {
    @Override
    //首先这个美工组应该能找到吧，要不你跟谁谈？
    public void find() {
        System.out.println("找到美工组...");
    }

    //美工被要求增加一个页面
    @Override
    public void add() {
        System.out.println("客户要求增加一个页面...");
    }

    //客户要求对现有界面做修改
    @Override
    public void change() {
        System.out.println("客户要求修改一个页面...");
    }

    //甲方是老大，要求删除一些页面
    @Override
    public void delete() {
        System.out.println("客户要求删除一个页面...");
    }

    //所有的增、删、改都要给出计划
    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划...");
    }
}
