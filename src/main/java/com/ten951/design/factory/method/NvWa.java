package com.ten951.design.factory.method;

/**
 * @author Darcy
 * @date 2019-08-19 09:43
 */
public class NvWa {
    public static void main(String[] args) {
        //声明阴阳八卦炉
        AbstractHumanFactory yinYangLu = new HumanFactory();
        //女娲第一次造人，火候不足，于是白人产生了
        System.out.println("--造出的第一批人是白色人种--");
        Human human = yinYangLu.createHuman(HumanType.white);
        human.getColor();
        human.talk();
        //女娲第二次造人，火候过足，于是黑人产生了
        System.out.println("\n--造出的第二批人是黑色人种--");
        Human blackHuman = yinYangLu.createHuman(HumanType.black);
        blackHuman.getColor();
        blackHuman.talk();
        //第三次造人，火候刚刚好，于是黄色人种产生了
        System.out.println("\n--造出的第三批人是黄色人种--");
        Human yellowHuman = yinYangLu.createHuman(HumanType.yellow);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
