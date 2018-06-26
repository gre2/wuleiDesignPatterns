package com.wl.factory.abstr;


import com.wl.factory.abstr.common.Car;

public abstract class AbstractCarFactory implements CarFactory {

    public static Car getCar(CarEnum carEnum) throws Exception {
        return (Car) Class.forName(carEnum.getModel()).newInstance();
    }
}
