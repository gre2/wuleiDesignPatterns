package com.wl.visitor;

/**
 * Created by User on 2018/9/18.
 */
public class TestMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.useComputer(new Usb());
    }
}
