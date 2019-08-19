package com.ten951.design.builder;

import java.util.ArrayList;

/**
 * @author Darcy
 * @date 2019-08-19 14:07
 */
public class BenzBuilder extends AbstractCarBuilder {
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public AbstractCarModel getCarModel() {
        return benz;
    }
}
