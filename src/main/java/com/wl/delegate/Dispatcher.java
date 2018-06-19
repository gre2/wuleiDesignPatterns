package com.wl.delegate;

public class Dispatcher implements IExector {

    private IExector exector;

    public Dispatcher(IExector exector) {
        this.exector = exector;
    }

    @Override
    public void dothing() {
        exector.dothing();
    }
}
