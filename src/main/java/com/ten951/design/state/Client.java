package com.ten951.design.state;

/**
 * @author Darcy
 * @date 2019-08-21 21:49
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
