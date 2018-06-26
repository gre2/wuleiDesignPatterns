package com.wl.builder;


import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("start");
        list.add("stop");
        list.add("putOnSteam");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(list);
        benzBuilder.getCarModel().run();
    }
}
