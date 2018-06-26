package com.wl.builder.model;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {

    private List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void putOnSteam();

    protected abstract void stop();

    final public void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equals("start")) {
                this.start();
            }
            if (actionName.equals("putOnSteam")) {
                this.putOnSteam();
            }
            if (actionName.equals("stop")) {
                this.stop();
            }
        }
    }


    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
