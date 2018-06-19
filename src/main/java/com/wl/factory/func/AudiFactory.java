package com.wl.factory.func;

import com.wl.factory.common.Audi;
import com.wl.factory.common.Car;

public class AudiFactory implements Factory {

    @Override
    public Car getCar() {
        return new Audi();
    }
}
