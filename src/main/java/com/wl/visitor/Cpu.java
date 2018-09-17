package com.wl.visitor;

/**
 * Created by User on 2018/9/18.
 */
public class Cpu extends ComputerPart {
    @Override
    protected void link(YingJianInterface yingJianInterface) {
        yingJianInterface.visitor(this);
        System.out.println("cpu");
    }
}