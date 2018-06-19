package com.wl.factory.abstr;

import com.wl.factory.common.Benz;
import com.wl.factory.common.Car;

public class BenzFactory extends AbstractFactory {

    @Override
    public Car getCar() {
        return new Benz();
    }
}
