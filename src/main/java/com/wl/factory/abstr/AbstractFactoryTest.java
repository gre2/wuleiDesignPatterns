package com.wl.factory.abstr;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AudiFactory();
        String name = abstractFactory.getCar().getName();
        System.out.println(name);
    }

}
