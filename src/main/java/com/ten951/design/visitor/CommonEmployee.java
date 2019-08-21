package com.ten951.design.visitor;

/**
 * @author Darcy
 * @date 2019-08-21 19:23
 */
public class CommonEmployee extends AbstractEmployee {

    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
