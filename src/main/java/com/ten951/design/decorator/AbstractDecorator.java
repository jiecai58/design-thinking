package com.ten951.design.decorator;

/**
 * @author Darcy
 * @date 2019-08-20 19:47
 */
public class AbstractDecorator extends AbstractSchoolReport {
    private AbstractSchoolReport report;

    public AbstractDecorator(AbstractSchoolReport report) {
        this.report = report;
    }

    @Override
    public void report() {
        report.report();
    }

    @Override
    public void sign(String name) {
        report.sign(name);
    }
}
