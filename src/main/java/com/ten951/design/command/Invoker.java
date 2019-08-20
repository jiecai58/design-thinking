package com.ten951.design.command;

/**
 * @author Darcy
 * @date 2019-08-20 10:30
 */
public class Invoker {
    private AbstractCommand command;



    public void action() {
        command.execute();
    }

    public AbstractCommand getCommand() {
        return command;
    }

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }
}
