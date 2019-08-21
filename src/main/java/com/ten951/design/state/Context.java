package com.ten951.design.state;

/**
 * @author Darcy
 * @date 2019-08-21 21:40
 */
public class Context {
    public final static OpenningState OPENNING_STATE = new OpenningState();
    public final static ClosingState CLOSEING_STATE = new ClosingState();
    public final static RunningState RUNNING_STATE = new RunningState();
    public final static StoppingState STOPPING_STATE = new StoppingState();
    private AbstractLiftState liftState;

    public AbstractLiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(AbstractLiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
