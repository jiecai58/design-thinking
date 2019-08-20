package com.ten951.design.command;

/**
 * @author Darcy
 * @date 2019-08-20 10:29
 */
public class AddRequirementCommand extends AbstractCommand {
    @Override
    public void execute() {
        //找到需求组
        super.rg.find();
        //增加一份需求
        super.rg.add();
        //给出计划
        super.rg.plan();
    }
}
