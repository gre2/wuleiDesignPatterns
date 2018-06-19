package com.wl.factory.abstr;

import com.wl.factory.common.Audi;
import com.wl.factory.common.Car;

public class AudiFactory extends AbstractFactory {

    @Override
    public Car getCar() {
        return new Audi();
    }
}
