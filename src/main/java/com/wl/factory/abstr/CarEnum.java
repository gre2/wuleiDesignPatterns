package com.wl.factory.abstr;

public enum CarEnum {
    Bmw_X6("com.wl.factory.abstr.common.BmwSpecial"),
    Bmw_Common("com.wl.factory.abstr.common.BmwCommon"),
    Benz_G500("com.wl.factory.abstr.common.BenzSpecialy"),
    Benz_Common("com.wl.factory.abstr.common.BenzCommon"),
    Audi_A4("com.wl.factory.abstr.common.AudiSpecial"),
    Audi_Common("com.wl.factory.abstr.common.AudiCommon");

    private String model;

    private CarEnum(String carModel) {
        this.model = carModel;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
