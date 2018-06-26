package com.wl.builder;

import com.wl.builder.model.AudiModel;
import com.wl.builder.model.CarModel;

import java.util.List;

public class AudiBuilder extends CarBuilder {

    private AudiModel audiModel = new AudiModel();

    @Override
    protected void setSequence(List<String> list) {
        this.audiModel.setSequence(list);
    }

    @Override
    protected CarModel getCarModel() {
        return audiModel;
    }
}
