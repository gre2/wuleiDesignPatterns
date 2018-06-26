package com.wl.factory.facmethod;

import com.wl.factory.common.Audi;
import com.wl.factory.common.Bmw;

public class FactoryTest {

    //工厂方法
    public static void main(String[] args) throws Exception {

        System.out.println(CarFactory.getCar(Audi.class).getName());
        System.out.println(CarFactory.getCar(Bmw.class).getName());
    }
}
