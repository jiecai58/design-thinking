package com.ten951.design.command;

/**
 * @author Darcy
 * @date 2019-08-20 10:30
 */
public class DeletePageCommand extends AbstractCommand {
    @Override
    public void execute() {
        //找到页面组
        super.pg.find();
        //删除一个页面
        super.rg.delete();
        //给出计划
        super.rg.plan();
    }
}
