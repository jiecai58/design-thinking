package com.ten951.design.decorator;

/**
 * @author Darcy
 * @date 2019-08-20 19:52
 */
public class FouthGradeSchoolReport extends AbstractSchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的XXX家长:");
        System.out.println("  ......");
        System.out.println("  语文 62  数学65 体育 98  自然  63");
        System.out.println("  .......");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }


}
