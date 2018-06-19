package com.wl.factory.func;

import com.wl.factory.common.Bmw;
import com.wl.factory.common.Car;

public class BmwFactory implements Factory {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
