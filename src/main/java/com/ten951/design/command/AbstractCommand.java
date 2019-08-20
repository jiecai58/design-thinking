package com.ten951.design.command;

/**
 * 这里是可以优化的. 减少高层模块(AbstractCommand)对低层模块（Group角色类）的依赖关系，提高系统整体的稳定性
 *
 * @author Darcy
 * @date 2019-08-20 10:28
 */
public abstract class AbstractCommand {
    //把三个组都定义好，子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup();  //需求组
    protected PageGroup pg = new PageGroup();  //美工组
    protected CodeGroup cg = new CodeGroup();  //代码组

    //只有一个方法，你要我做什么事情
    public abstract void execute();
}
