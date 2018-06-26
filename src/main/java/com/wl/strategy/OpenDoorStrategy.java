package com.wl.strategy;

public class OpenDoorStrategy implements StrategyInterface {

    @Override
    public void operator() {
        System.out.println("开门");
    }
}
