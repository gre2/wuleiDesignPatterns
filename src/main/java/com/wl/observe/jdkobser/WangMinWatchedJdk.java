package com.wl.observe.jdkobser;


import java.util.Observable;

public class WangMinWatchedJdk extends Observable {


    public void playBall() {
        System.out.println("王敏要去打球了");
        super.setChanged();
        this.notifyObservers("通知:王敏去打球了");
    }


}
