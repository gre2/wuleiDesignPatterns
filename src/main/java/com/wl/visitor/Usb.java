package com.wl.visitor;

/**
 * Created by User on 2018/9/18.
 */
public class Usb implements YingJianInterface {
    @Override
    public void visitor(Cpu cpu) {
        System.out.println("Usb cpu");
    }

    @Override
    public void visitor(VideoCard vCard) {
        System.out.println("Usb VideoCard");
    }
}
