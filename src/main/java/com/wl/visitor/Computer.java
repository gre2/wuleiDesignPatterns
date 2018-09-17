package com.wl.visitor;

/**
 * Created by User on 2018/9/18.
 */
public class Computer {
    public void useComputer(YingJianInterface yingJianInterface) {
        new Cpu().link(yingJianInterface);
        new VideoCard().link(yingJianInterface);
    }
}
