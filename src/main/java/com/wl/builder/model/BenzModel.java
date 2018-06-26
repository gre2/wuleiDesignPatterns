package com.wl.builder.model;

public class BenzModel extends CarModel {


    @Override
    protected void start() {
        System.out.println("benz启动了");
    }

    @Override
    protected void putOnSteam() {
        System.out.println("benz加油了");
    }

    @Override
    protected void stop() {
        System.out.println("benz停止了");
    }
}
