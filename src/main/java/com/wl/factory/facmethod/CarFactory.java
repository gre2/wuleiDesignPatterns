package com.wl.factory.facmethod;

import com.wl.factory.common.Car;

public class CarFactory {

    public static Car getCar(Class clazz) throws Exception {
        return (Car) Class.forName(clazz.getName()).newInstance();
    }
}
