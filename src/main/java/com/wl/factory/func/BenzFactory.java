package com.wl.factory.func;

import com.wl.factory.common.Benz;
import com.wl.factory.common.Car;

public class BenzFactory implements Factory {

    @Override
    public Car getCar() {
        return new Benz();
    }
}
