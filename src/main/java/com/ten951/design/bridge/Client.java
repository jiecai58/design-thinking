package com.ten951.design.bridge;

/**
 * @author Darcy
 * @date 2019-08-21 22:26
 */
public class Client {
    public static void main(String[] args) {
        AbstractBrushPen pen = new BigBrushPenRefined();
        pen.setImplementor(new OncreteImplementorRed());
        pen.operationDraw();
    }
}
