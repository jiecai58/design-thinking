package com.ten951.design.state;

/**
 * @author Darcy
 * @date 2019-08-21 21:42
 */
public class OpenningState extends AbstractLiftState {
    @Override
    public void open() {
        //状态修改
        super.context.setLiftState(Context.CLOSEING_STATE);
        //动作委托为CloseState来执行
        super.context.getLiftState().close();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
