package com.ten951.design.state;

/**
 * @author Darcy
 * @date 2019-08-21 21:44
 */
public class RunningState extends AbstractLiftState {
    @Override
    public void close() {
    }

    @Override
    public void open() {
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
