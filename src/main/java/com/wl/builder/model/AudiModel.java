package com.wl.builder.model;

public class AudiModel extends CarModel {


    @Override
    protected void start() {
        System.out.println("audi启动了");
    }

    @Override
    protected void putOnSteam() {
        System.out.println("audi加油了");
    }

    @Override
    protected void stop() {
        System.out.println("audi停止了");
    }
}
