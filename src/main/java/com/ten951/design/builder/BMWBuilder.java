package com.ten951.design.builder;

import java.util.ArrayList;

/**
 * @author Darcy
 * @date 2019-08-19 14:08
 */
public class BMWBuilder extends AbstractCarBuilder {
    private BMWModel bmwCarModel = new BMWModel();

    @Override
    public void setSequence(ArrayList sequence) {
        this.bmwCarModel.setSequence(sequence);

    }

    @Override
    public AbstractCarModel getCarModel() {
        return this.bmwCarModel;
    }
}
