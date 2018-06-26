package com.wl.factory.abstr;


import com.wl.factory.abstr.common.Car;

public class SpecialCarFactory extends AbstractCarFactory {

    @Override
    public Car getBmwModel() {
        try {
            return super.getCar(CarEnum.Bmw_X6);
        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public Car getAudiModel() {
        try {
            return super.getCar(CarEnum.Audi_A4);
        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public Car getBenzModel() {
        try {
            return super.getCar(CarEnum.Benz_G500);
        } catch (Exception e) {

        }
        return null;
    }
}
