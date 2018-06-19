package com.wl.factory.simple;

import com.wl.factory.common.Car;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        Car car = new SimpleFactory().getCar("benz");
        System.out.println(car.getName());
    }
}
