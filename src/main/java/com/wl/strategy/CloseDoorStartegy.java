package com.wl.strategy;

public class CloseDoorStartegy implements StrategyInterface {

    @Override
    public void operator() {
        System.out.println("关门");
    }
}
