package com.wl.factory.func;

public class FactoryTest {

    public static void main(String[] args) {
        Factory factory = new AudiFactory();
        String name = factory.getCar().getName();
        System.out.println(name);
    }
}
