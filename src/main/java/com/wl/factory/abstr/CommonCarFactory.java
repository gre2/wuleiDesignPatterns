package com.wl.factory.abstr;


import com.wl.factory.abstr.common.Car;

public class CommonCarFactory extends AbstractCarFactory {

    @Override
    public Car getBmwModel() {
        try {
            return super.getCar(CarEnum.Bmw_Common);
        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public Car getAudiModel() {
        try {
            return super.getCar(CarEnum.Audi_Common);
        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public Car getBenzModel() {
        try {
            return super.getCar(CarEnum.Benz_Common);
        } catch (Exception e) {

        }
        return null;
    }
}
