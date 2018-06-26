package com.wl.strategy;

public class MainTest {
    public static void main(String[] args) {
        Context context = null;
        //在门口的时候
        context = new Context(new OpenDoorStrategy());
        context.opera();
        //在门口的时候
        context = new Context(new CloseDoorStartegy());
        context.opera();
    }
}
