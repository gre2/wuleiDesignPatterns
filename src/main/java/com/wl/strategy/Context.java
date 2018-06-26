package com.wl.strategy;

public class Context {

    private StrategyInterface strategyInterface;

    public Context(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    public void opera() {
        this.strategyInterface.operator();
    }
}
