package com.wl.builder;

import com.wl.builder.model.CarModel;

import java.util.List;

public abstract class CarBuilder {
    protected abstract void setSequence(List<String> list);

    protected abstract CarModel getCarModel();

}
