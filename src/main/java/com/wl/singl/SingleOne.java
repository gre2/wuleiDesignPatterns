package com.wl.singl;

public class SingleOne {
    private SingleOne() {
    }

    private static volatile SingleOne single = null;

    public static SingleOne getInstance() {
        if (single == null) {
            synchronized (SingleOne.class) {
                if (single == null) {
                    single = new SingleOne();
                }
            }
        }
        return single;
    }
}
