package com.ten951.design.bridge;

/**
 * @author Darcy
 * @date 2019-08-21 22:24
 */
public class BigBrushPenRefined extends AbstractBrushPen {


    @Override
    public void operationDraw() {
        System.out.println("Big and " + color.bepaint() + " drawing!");
    }
}
