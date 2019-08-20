package com.ten951.design.decorator;

/**
 * 给成绩单添加最高成绩功能
 * @author Darcy
 * @date 2019-08-20 19:48
 */
public class HighScoreDecorator extends AbstractDecorator {
    public HighScoreDecorator(AbstractSchoolReport report) {
        super(report);
    }


    //我要汇报最高成绩
    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
