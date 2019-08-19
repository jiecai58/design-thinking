package com.ten951.design.builder;

import java.util.ArrayList;

/**
 * @author Darcy
 * @date 2019-08-19 14:06
 */
public abstract class AbstractCarBuilder {
    //建造一个模型，你要给我一个顺序要求，就是组装顺序
    public abstract void setSequence(ArrayList sequence);

    //设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract AbstractCarModel getCarModel();
}
