package com.wl.factory.abstr;


import com.wl.factory.abstr.common.Car;

public class CarMainTest {

    public static void main(String[] args) throws Exception {
        CarFactory carFactory = new SpecialCarFactory();
        Car car = carFactory.getAudiModel();
        System.out.println(car.getName());
        System.out.println(car.getModel());

    }
}
