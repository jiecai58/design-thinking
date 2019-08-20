package com.ten951.design.command;

/**
 * 优化后的命令高层模块. 根据不同的group实现类去执行不同的方法. 做到了单一职责原则
 *
 * @author Darcy
 * @date 2019-08-20 10:42
 */
public abstract class AbstractPerfectCommand {
    protected final Group group;

    public AbstractPerfectCommand(Group group) {
        this.group = group;
    }

    //只有一个方法，你要我做什么事情
    public abstract void execute();
}
