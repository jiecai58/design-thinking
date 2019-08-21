package com.ten951.design.state;

/**
 * @author Darcy
 * @date 2019-08-21 21:45
 */
public class StoppingState extends AbstractLiftState {
    @Override
    public void close() {
    }

    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.getLiftState().open();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
