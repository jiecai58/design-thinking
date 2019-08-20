package com.ten951.design.command;

/**
 * @author Darcy
 * @date 2019-08-20 10:31
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        AbstractCommand command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
