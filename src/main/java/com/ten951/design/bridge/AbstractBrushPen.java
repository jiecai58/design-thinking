package com.ten951.design.bridge;

/**
 * @author Darcy
 * @date 2019-08-21 22:23
 */
public abstract class AbstractBrushPen {
    protected ImplementorColor color;


    /**
     * 每种笔都有自己的实现
     */
    public abstract void operationDraw();

    public void setImplementor(ImplementorColor color) {
        this.color = color;
    }
}
