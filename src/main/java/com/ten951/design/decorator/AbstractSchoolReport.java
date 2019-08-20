package com.ten951.design.decorator;

/**
 * @author Darcy
 * @date 2019-08-20 19:45
 */
public abstract class AbstractSchoolReport {
    //成绩单主要展示的就是你的成绩情况
    public abstract void report();

    //成绩单要家长签字，这个是最要命的
    public abstract void sign(String name);
}
