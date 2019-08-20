package com.ten951.design.strategy;

/**
 * @author Darcy
 * @date 2019-08-20 22:30
 */
public class Client {
    public static void main(String[] args) {
        Context context;
        //刚刚到吴国的时候拆第一个
        System.out.println("---刚刚到吴国的时候拆第一个---");
        context = new Context(new BackDoor());
        context.operate();  //拆开执行
        System.out.println("\n\n\n\n\n\n\n\n");
        //刘备乐不思蜀了，拆第二个了
        System.out.println("---刘备乐不思蜀了，拆第二个了---");
        context = new Context(new GivenGreenLight());
        context.operate();  //执行了第二个锦囊
        System.out.println("\n\n\n\n\n\n\n\n");
        //孙权的小兵追来了，咋办？拆第三个
        System.out.println("---孙权的小兵追来了，咋办？拆第三个---");
        context = new Context(new BlockEnemy());
        context.operate();  //孙夫人退兵
        System.out.println("\n\n\n\n\n\n\n\n");

    }
}
