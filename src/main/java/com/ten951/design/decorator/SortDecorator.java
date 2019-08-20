package com.ten951.design.decorator;

/**
 * 添加成绩排名功能
 * @author Darcy
 * @date 2019-08-20 19:49
 */
public class SortDecorator extends AbstractDecorator {
    public SortDecorator(AbstractSchoolReport report) {
        super(report);
    }

    //告诉老爸学校的排名情况
    private void reportSort(){
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
