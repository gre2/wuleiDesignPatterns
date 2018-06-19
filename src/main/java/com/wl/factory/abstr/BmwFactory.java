package com.wl.factory.abstr;

import com.wl.factory.common.Bmw;
import com.wl.factory.common.Car;

public class BmwFactory extends AbstractFactory {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
