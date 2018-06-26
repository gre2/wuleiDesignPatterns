package com.wl.factory.facmethod.transform;

public class TransformFactoryTest {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 3; i++) {
            System.out.println(TransformCarFactory.getCar().getName());
        }
    }
}
