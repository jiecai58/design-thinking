package com.ten951.design.command;

/**
 * @author Darcy
 * @date 2019-08-20 10:27
 */
public class CodeGroup implements Group {
    @Override
    //客户要求代码组过去和他们谈
    public void find() {
        System.out.println("找到代码组...");
    }

    //客户要求增加一项功能
    @Override
    public void add() {
        System.out.println("客户要求增加一项功能...");
    }

    //客户要求修改一项功能
    @Override
    public void change() {
        System.out.println("客户要求修改一项功能...");
    }

    //客户要求删除一项功能
    @Override
    public void delete() {
        System.out.println("客户要求删除一项功能...");
    }

    //客户要求给出变更计划
    @Override
    public void plan() {
        System.out.println("客户要求代码变更计划...");
    }
}
