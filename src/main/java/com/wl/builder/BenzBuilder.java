package com.wl.builder;

import com.wl.builder.model.BenzModel;
import com.wl.builder.model.CarModel;

import java.util.List;

public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    protected void setSequence(List<String> list) {
        this.benzModel.setSequence(list);
    }

    @Override
    protected CarModel getCarModel() {
        return benzModel;
    }
}
