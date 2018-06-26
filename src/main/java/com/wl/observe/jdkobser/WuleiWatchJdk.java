package com.wl.observe.jdkobser;


import java.util.Observable;
import java.util.Observer;

public class WuleiWatchJdk implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("吴磊:王敏开始活动");
        System.out.println("吴磊:王敏结束活动");
    }
}
